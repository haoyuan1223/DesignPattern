package mvc;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * Created by Yuan Hao on 2018/11/15 13:37
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
  
  private Sequencer sequencer;
  private ArrayList<BeatObserver> beatObservers = new ArrayList<>();
  private ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
  private int bpm = 90;
  private Sequence sequence;
  private Track track;
  
  public void meta(MetaMessage message) {
    if (message.getType() == 47) {
      notifyBeatObservers();
      sequencer.start();
      setBPM(getBPM());
    }
  }
  
  private void setUpMidi() {
    try {
      sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.addMetaEventListener(this);
      sequence = new Sequence(Sequence.PPQ, 4);
      track = sequence.createTrack();
      sequencer.setTempoInBPM(getBPM());
      sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private void buildTrackAndStart() {
    int[] trackList = {35, 0, 46, 0};
    
    sequence.deleteTrack(null);
    track = sequence.createTrack();
    
    makeTracks(trackList);
    track.add(makeEvent(192, 1, 0, 4));
    try {
      sequencer.setSequence(sequence);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private void makeTracks(int[] list) {
    for (int i = 0; i < list.length; i++) {
      int key = list[i];
      if (key != 0) {
        track.add(makeEvent(144, key, 100, i));
        track.add(makeEvent(128, key, 100, i + 1));
      }
    }
  }
  
  private MidiEvent makeEvent(int comd, int one, int two, int tick) {
    MidiEvent event = null;
    try {
      ShortMessage a = new ShortMessage();
      a.setMessage(comd, 9, one, two);
      event = new MidiEvent(a, tick);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return event;
  }
  
  @Override
  public void initialize() {
    setUpMidi();
    buildTrackAndStart();
  }
  
  @Override
  public void on() {
    System.out.println("Starting the sequencer");
    sequencer.start();
    setBPM(90);
  }
  
  @Override
  public void off() {
    setBPM(0);
    sequencer.stop();
  }
  
  @Override
  public void setBPM(int bpm) {
    this.bpm = bpm;
    sequencer.setTempoInBPM(getBPM());
    notifyBPMObservers();
  }
  
  @Override
  public int getBPM() {
    return bpm;
  }
  
  @Override
  public void registerObserver(BeatObserver o) {
    beatObservers.add(o);
  }
  
  private void notifyBeatObservers() {
    for (BeatObserver beatObserver : beatObservers) {
      beatObserver.updateBeat();
    }
  }
  
  @Override
  public void removeObserver(BeatObserver o) {
    beatObservers.remove(o);
  }
  
  @Override
  public void registerObserver(BPMObserver o) {
    bpmObservers.add(o);
  }
  
  private void notifyBPMObservers() {
    for (BPMObserver bpmObserver : bpmObservers) {
      bpmObserver.updateBPM();
    }
  }
  
  @Override
  public void removeObserver(BPMObserver o) {
    bpmObservers.remove(o);
  }
}

package Ch07_Adapter_Facade.FacadePattern;

public class Amplifier {
  private String description;
  private Tuner tuner;
  private DVDPlayer dvdPlayer;
  private CDPlayer cdPlayer;
  
  public Amplifier(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " on");
  }
  
  public void off() {
    System.out.println(description + " off");
  }
  
  public void setStereoSound() {
    System.out.println(description + " stereo mode on");
  }
  
  public void setSurroundSound() {
    System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
  }
  
  public void setVolume(int level) {
    System.out.println(description + " setting volume to " + level);
  }
  
  public void setTuner(Tuner tuner) {
    System.out.println(description + " setting tuner to " + dvdPlayer);
    this.tuner = tuner;
  }
  
  public void setDvd(DVDPlayer dvd) {
    System.out.println(description + " setting DVD player to " + dvd);
    this.dvdPlayer = dvd;
  }
  
  public void setCd(CDPlayer cd) {
    System.out.println(description + " setting CD player to " + cd);
    this.cdPlayer = cd;
  }
  
  public String toString() {
    return description;
  }
  
}

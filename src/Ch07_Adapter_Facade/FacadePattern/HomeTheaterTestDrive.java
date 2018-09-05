package Ch07_Adapter_Facade.FacadePattern;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
    DVDPlayer dvd = new DVDPlayer("Top-O-Line DVD Player");
    CDPlayer cd = new CDPlayer("Top-O-Line CD Player");
    Projector projector = new Projector("Top-O-Line Projector");
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");
    
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}

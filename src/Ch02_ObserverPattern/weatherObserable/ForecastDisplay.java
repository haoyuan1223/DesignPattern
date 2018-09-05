package Ch02_ObserverPattern.weatherObserable;

import Ch02_ObserverPattern.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  
  ForecastDisplay(Observable observable) {
    observable.addObserver(this);
  }
  
  public void display() {
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
  
  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }
}

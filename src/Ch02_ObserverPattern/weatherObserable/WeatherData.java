package Ch02_ObserverPattern.weatherObserable;

import java.util.Observable;

public class WeatherData extends Observable {
  private float temperature;
  
  private float humidity;
  
  private float pressure;
  
  public WeatherData() {
  }
  
  private void measurementsChanged() {
    setChanged();
    notifyObservers();
  }
  
  void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
  
  float getTemperature() {
    return temperature;
  }
  
  float getHumidity() {
    return humidity;
  }
  
  float getPressure() {
    return pressure;
  }
}

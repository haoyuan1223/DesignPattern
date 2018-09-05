package Ch02_ObserverPattern.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
  
  private ArrayList<Observer> observers;
  
  private float temperature;
  
  private float humidity;
  
  private float pressure;
  
  public WeatherData() {
    observers = new ArrayList<>();
  }
  
  public float getTemperature() {
    return temperature;
  }
  
  public float getHumidity() {
    return humidity;
  }
  
  public float getPressure() {
    return pressure;
  }
  
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  
  @Override
  public void removeObserver(Observer observer) {
    int i = observers.indexOf(observer);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  
  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(temperature, humidity, pressure));
  }
  
  private void measurementsChanged() {
    notifyObservers();
  }
  
  void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}

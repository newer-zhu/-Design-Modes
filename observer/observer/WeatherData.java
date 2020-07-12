package observer.observer;

import observer.traditional.CurrentConditions;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        notifyObservers();
    }

    public void setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }

    @Override
    public void registerObserver(Observer b) {
        observers.add(b);
    }

    @Override
    public void removeObserver(Observer b) {
        if (observers.contains(b))
            observers.remove(b);
    }

    @Override
    public void notifyObservers() {
        for (Observer b : observers){
            b.update(this.temperature,this.pressure,this.humidity);
        }
    }
}

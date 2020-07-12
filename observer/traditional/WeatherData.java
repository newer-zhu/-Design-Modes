package observer.traditional;

public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions conditions;

    public WeatherData(CurrentConditions conditions) {
        this.conditions = conditions;
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
        conditions.update(getTemperature(),getPressure(),getHumidity());
    }

    public void setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }
}

package observer.traditional;

import observer.traditional.CurrentConditions;
import observer.traditional.WeatherData;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30,120,10);
    }
}

import observer.CurrentConditionsDisplay;
import observer.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay=  new CurrentConditionsDisplay(weatherData);
//        Statis
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(55,91,99.4f);
        weatherData.setMeasurements(34,27,17.4f);
    }

}

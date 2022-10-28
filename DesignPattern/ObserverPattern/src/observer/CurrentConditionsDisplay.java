package observer;

import Interfaces.DisplayElement;
import Interfaces.Subject;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
//    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}

//public class CurrentConditionsDisplay implements Observer, DisplayElement {
//    private float temperature;
//    private float humidity;
//    private Subject weatherData;
//
//    public CurrentConditionsDisplay(Subject weatherData){
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
//
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature=temperature;
//        this.humidity=humidity;
//        display();
//    }
//    @Override
//    public void display() {
//        System.out.println("Current conditions: "+ temperature+ "F degrees and "+ humidity+ "% humidity");
//    }
//
//}

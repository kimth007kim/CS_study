package observer;

import Interfaces.Observer;
import Interfaces.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature= temperature;
        this.humidity=humidity;
        this.pressure= pressure;
        measurementsChanged();



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

}

//public class WeatherData implements Subject {
//    private ArrayList observers;
//    private float temperature;
//    private float humidity;
//    private float pressure;
//
//    public WeatherData() {
//        observers = new ArrayList();
//    }
//
//    @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0) {
//            observers.remove(i);
//        }
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (int i =0; i<observers.size(); i++){
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature,humidity,pressure);
//        }
////        for (Object ob : observers) {
////            Observer observer = (Observer) ob;
////            observer.update(temperature, humidity, pressure);
////        }
//    }
//
//    public void measurementsChanged(){
//        notifyObservers();
//    }
//
//    public void setMeasurements(float temperature, float humidity,float pressure){
//        this.temperature=temperature;
//        this.humidity=humidity;
//        this.pressure=pressure;
//        measurementsChanged();
//    }
//}

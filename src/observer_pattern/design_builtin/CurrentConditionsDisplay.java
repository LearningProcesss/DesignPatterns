package observer_pattern.design_builtin;

import java.util.Observable;
import java.util.Observer;

import observer_pattern.design_refactoring.interfaces.IDisplayElement;

public class CurrentConditionsDisplay implements Observer, IDisplayElement {

    private Observable observable;
    private float t;
    private float h;

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        this.observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            this.t = weatherData.getTemp();
            this.h = weatherData.getHumidity();

            this.display();
        }

    }

    public void display() {
        System.out.println(
                String.format("Current conditions: temperature %a F degrees and humidity %a humidity", this.t, this.h));
    }

}
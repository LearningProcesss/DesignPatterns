package observer_pattern.design_refactoring.display;

import observer_pattern.design_refactoring.interfaces.IDisplayElement;
import observer_pattern.design_refactoring.interfaces.IObserver;
import observer_pattern.design_refactoring.interfaces.ISubject;

/**
 * CurrentConditionsDisplay
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private float t;
    private float u;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println(String.format("Current conditions: temperature %a F degrees and humidity %a humidity", this.t, this.u));
    }

    public void update(float temp, float umidity, float pressure) {
        this.t = temp;
        this.u = umidity;
        display();
    }

}
package observer_pattern.design_refactoring;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.design_refactoring.interfaces.IObserver;
import observer_pattern.design_refactoring.interfaces.ISubject;

/**
 * WeatherData
 */
public class WeatherData implements ISubject {

    private List<IObserver> observers;
    private float temp;
    private float umidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<IObserver>();
    }

    public void registerObserver(IObserver o) {
        this.observers.add(o);

    }

    public void removeObserver(IObserver o) {

        int index = this.observers.indexOf(o);

        if (index >= 0) {
            this.observers.remove(o);
        }
    }

    public void notifyObservers() {
        observers.forEach((o) -> o.update(this.temp, this.umidity, this.pressure));
    }

    public void measuramentChanged() {
        this.notifyObservers();
    }

    public void setMeasurament(float t, float u, float p) {
        this.temp = t;
        this.umidity = u;
        this.pressure = p;

        this.measuramentChanged();
    }

}
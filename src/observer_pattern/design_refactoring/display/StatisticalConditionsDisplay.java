
package observer_pattern.design_refactoring.display;

import observer_pattern.design_refactoring.interfaces.IDisplayElement;
import observer_pattern.design_refactoring.interfaces.IObserver;
import observer_pattern.design_refactoring.interfaces.ISubject;

/**
 * StatisticalConditionsDisplay
 */
public class StatisticalConditionsDisplay implements IObserver, IDisplayElement {

    private float t;
    private float u;
    private float p;
    private ISubject weatherData;

    public StatisticalConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println(String.format("Statistical conditions: pressure %a  and humidity %a humidity", this.p, this.u));
    }

    public void update(float temp, float umidity, float pressure) {
        this.t = temp;
        this.u = umidity;
        this.p = pressure;
        display();
    }
    
}
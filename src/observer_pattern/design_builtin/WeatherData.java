
package observer_pattern.design_builtin;

import java.util.Observable;

/**
 * WeatherData
 */
public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measuramentChanged() {
        this.setChanged();

        notifyObservers();
    }

    public void setMeasurament(float t, float p, float h) {
        this.humidity = h;
        this.temp = t;
        this.pressure = p;

        this.measuramentChanged();
    }

    public float getTemp() {
        return this.temp;
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }
}
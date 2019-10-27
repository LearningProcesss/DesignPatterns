
package observer_pattern.design_problem;

/**
 * WeatherData
 */
public class WeatherData {

    public WeatherData() {
    }

    public float getTemperature() {
        return 0.1f;
    }

    public float getUmidity() {
        return 0.1f;
    }

    public float getPressure() {
        return 0.1f;
    }

    public void measuramentChanged() {

        float temp = this.getTemperature();

        float umidity = this.getUmidity();

        float pressure = this.getPressure();

    }

    public void currentConditionsDisplay(float temp, float umidity, float pressure) {

    }

    public void staisticsDisplay(float temp, float umidity, float pressure) {
        
    }

    public void forecastDisplay(float temp, float umidity, float pressure) {
        
    }
}
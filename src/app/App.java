package app;

import observer_pattern.design_refactoring.display.*;
import observer_pattern.design_refactoring.WeatherData;
import strategy_pattern.design_refactoring.behavior.concrete.FlyConcreteWings;
import strategy_pattern.design_refactoring.duck.*;
import strategy_pattern.design_refactoring.duck.types.MallardDuck;
import strategy_pattern.design_refactoring.duck.types.RocketDuck;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("******************* Strategy Pattern *******************");
        
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck rocket = new RocketDuck();
        rocket.performFly();
        System.out.println("change behavior runtime!");
        rocket.setFlyBehavior(new FlyConcreteWings());
        rocket.performFly();

        System.out.println("*********************************************************");
        System.out.println("******************* Observer Pattern *******************");

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // StatisticalConditionsDisplay statisticalDisplay = new StatisticalConditionsDisplay(weatherData);

        // ForecastConditionsDisplay forecastDisplay = new ForecastConditionsDisplay(weatherData);

        weatherData.setMeasurament(80, 68, 36.5f);

        System.out.println("*********************************************************");
        System.out.println("******************* Observer Pattern Java*******************");

        observer_pattern.design_builtin.WeatherData weatherDataBi = new observer_pattern.design_builtin.WeatherData();

        observer_pattern.design_builtin.CurrentConditionsDisplay currentDispalyBi = new observer_pattern.design_builtin.CurrentConditionsDisplay(weatherDataBi);

        weatherDataBi.setMeasurament(15.5f, 89, 65);
    }
}
package app;

import observer_pattern.design_refactoring.display.*;
import singleton_pattern.SingletonDoubleCheckedLocking;
import decorator_pattern.design_refactoring.Beverage;
import decorator_pattern.design_refactoring.beverages.DarkRoast;
import decorator_pattern.design_refactoring.beverages.Espresso;
import decorator_pattern.design_refactoring.condiment.Mocha;
import decorator_pattern.design_refactoring.condiment.Whip;
import factory_pattern.factory_method.PizzaStore;
import factory_pattern.factory_method.ConcreteStore.ChicagoPizzaStore;
import factory_pattern.factory_method.ConcreteStore.NewYorkPizzaStore;
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

        // StatisticalConditionsDisplay statisticalDisplay = new
        // StatisticalConditionsDisplay(weatherData);

        // ForecastConditionsDisplay forecastDisplay = new
        // ForecastConditionsDisplay(weatherData);

        weatherData.setMeasurament(80, 68, 36.5f);

        System.out.println("*********************************************************");
        System.out.println("******************* Observer Pattern Java*******************");

        observer_pattern.design_builtin.WeatherData weatherDataBi = new observer_pattern.design_builtin.WeatherData();

        observer_pattern.design_builtin.CurrentConditionsDisplay currentDispalyBi = new observer_pattern.design_builtin.CurrentConditionsDisplay(
                weatherDataBi);

        weatherDataBi.setMeasurament(15.5f, 89, 65);
        System.out.println("*********************************************************");
        System.out.println("******************* Decorator Pattern *******************");

        Beverage espresso = new Espresso();

        System.out.println(String.format("%s - %s$", espresso.getDescription(), espresso.cost()));

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(String.format("%s - %s$", darkRoast.getDescription(), darkRoast.cost()));

        System.out.println("*********************************************************");
        System.out.println("******************* Factory method Pattern *******************");

        System.out.println("Order at NewYorkStore");
        PizzaStore newYorkStore = new NewYorkPizzaStore();
        newYorkStore.orderPizza("cheese");
        System.out.println("*********************");
        System.out.println("Order at ChicagoStore");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("broccoli");
        System.out.println("*********************");


        SingletonDoubleCheckedLocking s = SingletonDoubleCheckedLocking.getInstance();

    }
}
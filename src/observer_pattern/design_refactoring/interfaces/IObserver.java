package observer_pattern.design_refactoring.interfaces;

/**
 * IObserver
 */
public interface IObserver {

    public void update(float temp, float umidity, float pressure);
    
}
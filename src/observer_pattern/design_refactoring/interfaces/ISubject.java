package observer_pattern.design_refactoring.interfaces;

/**
 * ISubject
 */
public interface ISubject {

    public void registerObserver(IObserver o);
    
    public void removeObserver(IObserver o);
    
    public void notifyObservers();
}
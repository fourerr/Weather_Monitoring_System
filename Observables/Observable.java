package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * class represent the properties of all classes that can be noticed by another observes
 * @param <T> type of observable we want to inform
 */
public class Observable<T> {
    public List<Observer> itsObserver = new ArrayList<Observer>();

    /**
     * adding new observer to our list to update it if necessary
     * @param observer- we want to add
     */
    public void addObserver(Observer observer){
        itsObserver.add(observer);
    }

    /**
     * method that notify to all observes specific update
     * @param data - we send to observe to inform them
     */
    public void notifyObservers(T data){
        for (Observer observer : itsObserver){
            observer.update(data);
        }
    }

    /**
     * method remove specific observer from our list and not inform to it
     * @param observer we want to remove
     */
    public void removeObserver(Observer observer){
        itsObserver.remove(observer);
    }
}

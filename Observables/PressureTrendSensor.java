package WS1.Observables;

import WS1.Observers.Observer;

/**
 * class represent the pressure trend sensor - we want to inform to this class and infrom this class to the screen
 */
public class PressureTrendSensor extends Observable implements Observer {
    public int lastReading1; // older
    public int lastReading2; // middle
    public int lastReading3; // newest
    public Trend pressureState;
    public Trend lastState;

    /**
     * method calculate the status of trend
     * @return
     */
    public Trend calc() {
        if (lastReading3 > lastReading2 && lastReading2 > lastReading1) {
            return Trend.RISING;
        }

        if (lastReading3 < lastReading2 && lastReading2 < lastReading1) {
            return Trend.FALLING;
        }
        return Trend.STABLE;
    }

    /**
     * PART OF OBSERVABLE
     * method checks whether the trend is not stable and if it is - notify to all observers this
     * @param data accept to distinguish if we have any changes
     */
    public void check(int data){
        Trend trend=calc();

        if(trend != Trend.STABLE){
            notifyObservers(data);
        }

    }

    /**
     * PART OF OBSERVE
     * method update every moment and exposed to another observable class -receive updates from it
     * @param data
     */
    @Override
    public void update(Object data) {
        check((Integer) data);
    }
}

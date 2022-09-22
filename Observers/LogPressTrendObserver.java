package WS1.Observers;

import WS1.Observables.Trend;

/**
 * class represent the mediator between the log element and the interface observe in context of trend sensor
 */
public class LogPressTrendObserver implements Observer {

    Log itsLog;

    /**
     * ctor
     * @param log element log to send him the updates
     */
    public LogPressTrendObserver(Log log) {
        System.out.println("LogPressTrendObserver was created");
        this.itsLog = log;
    }

    /**
     * method that updates the log with new data
     * @param data
     */
    @Override
    public void update(Object data) {
        itsLog.displayTrend((Trend) data);
    }
}

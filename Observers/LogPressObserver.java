package WS1.Observers;

/**
 * class represent the mediator between the log element and the interface observe in context of pressure sensor
 */
public class LogPressObserver implements Observer {
    Log itsLog;

    /**
     * ctor
     * @param log -log element
     */
    public LogPressObserver(Log log) {
        System.out.println("LogPressObserver was created");
        this.itsLog = log;
    }

    /**
     * method update the log with the update data from observable
     * @param data -update data
     */
    @Override
    public void update(Object data) {
        itsLog.displayPressure((Integer) data);
    }
}

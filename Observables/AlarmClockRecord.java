package WS1.Observables;

/**
 * class holding all records of alarm clock
 */
public class AlarmClockRecord {
    int interval;
    int remainingTime;
    AlarmListener itsAlarmListener;

    /**
     * Ctor
     * @param interval -the time between the measurements of sensors
     * @param alarmListener -object of AlarmListener that listen to the alarm and calling to sensors if necessary
     */
    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = this.remainingTime = interval;
        this.itsAlarmListener = alarmListener;
        System.out.println("AlarmClockRecord was created");
    }

    /**
     * method decrement the remaining time until the remainingTime is zero
     * @param ticUnit - the time decrement ticUnit times every moment
     */
    public void decrementRemainingTime(int ticUnit) {
        remainingTime -= ticUnit;
    }
}

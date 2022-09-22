package WS1.Observables;

import java.util.ArrayList;

/**
 * class represent the alarm clock that wakes up the sensors
 */
public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();


    protected AlarmClock() {
        System.out.println("AlarmClock was created");
    }

    /**
     * singleton to create one instance of this class
     * @return
     */
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    /**
     * method that pass all over the records of sensors and wakes up if necessary
     */
    protected void tic(){
          for(AlarmClockRecord record: itsAlarmClockRecords){

              if((record.remainingTime - CLOCK_INTERVAL_MILLIS ) <= 0) {
                  record.itsAlarmListener.wakeup();
                  record.remainingTime = record.interval;
              }
              else
                record.decrementRemainingTime(CLOCK_INTERVAL_MILLIS);
          }

    }

    /**
     * method that register new sensors to our class in order to wake it up
     * @param interval -the time pass between measurements of the sensors
     * @param pal -object of AlarmListener that listen to the alarm and calling to sensors if necessary
     */
    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval,pal));
    }
}


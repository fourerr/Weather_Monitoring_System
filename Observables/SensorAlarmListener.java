package WS1.Observables;

/**
 * class represent sensor alarm listener listen to alarm and react accordingly to it
 */
public class SensorAlarmListener implements AlarmListener {
    Sensor itsSensor;
    public SensorAlarmListener(Sensor sensor) {
        itsSensor = sensor;
        System.out.println("SensorAlarmListener was created");
    }

    /**
     *method that wakes up every clock interruption
     */
    @Override
    public void wakeup() {
        itsSensor.check();
    }
}

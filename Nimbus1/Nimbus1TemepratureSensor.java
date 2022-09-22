package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.SensorAlarmListener;

import java.util.Random;

/**
 * class implements the temperature  sensor of our system
 */
public class Nimbus1TemepratureSensor extends Sensor {
    public Random rnd;
    /**
     * Ctor
     * @param type -the type of the sensor - pressure ,temperature
     * @param interval - the time pass between measurements
     */
    public Nimbus1TemepratureSensor(String type, int interval) {
        super(type, interval);
        System.out.println("Nimbus1TemepratureSensor was created");
        AlarmClock.theInstance().register(interval,new SensorAlarmListener(this));
    }

    /**
     * read measurement of temperature sensor using specific hardware
     * @return int- represent the measurement
     */
    @Override
    protected int read() {
        return (RandomSupplier.getRnd().nextInt())%(40);
    }
}

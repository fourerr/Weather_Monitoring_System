package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.SensorAlarmListener;

import java.util.Random;

/**
 * class implements the pressure sensor of our system
 */
public class Nimbus1PressureSensor extends Sensor {
    public Random rnd;

    /**
     * Ctor
     * @param type -the type of the sensor - pressure ,temperature
     * @param interval - the time pass between measurements
     */
    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
        System.out.println("Nimbus1PressureSensor was created");
        AlarmClock.theInstance().register(interval,new SensorAlarmListener(this));
    }

    /**
     * read measurement of pressure sensor using specific hardware
     * @return int- represent the measurement
     */
    @Override
    protected int read() {
        return (RandomSupplier.getRnd().nextInt())%(1050-950+1)+950;
    }
}

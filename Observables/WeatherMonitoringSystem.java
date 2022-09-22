package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;

/**
 * class include all the system and initialize all others components
 */
public class WeatherMonitoringSystem extends Observable  {
    protected static WeatherMonitoringSystem instance = null;

    /**
     * ctor -generates other components
     */
    protected WeatherMonitoringSystem() {
        new Nimbus1PressureSensor("AAA",1);
        new Nimbus1TemepratureSensor("BBB",2);
        System.out.println("WeatherMonitoringSystem was created");
    }

    /**
     * method implements the singleton pattern for this class
     * @return one instance of this class
     */
    public static WeatherMonitoringSystem theInstance(){
         if(instance == null)
             instance = new WeatherMonitoringSystem();

        return instance;
    }
}

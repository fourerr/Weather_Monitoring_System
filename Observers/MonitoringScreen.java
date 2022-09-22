package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

/**
 * class represent the UI-Monitoring Screen output that observes sensors and take their information
 */
public class MonitoringScreen {
    /**
     * Ctor
     * @param weatherMonitoringSystem the observable element to inform to this class updates
     */
    public MonitoringScreen(WeatherMonitoringSystem weatherMonitoringSystem) {
        System.out.println("MonitoringScreen was created");
        weatherMonitoringSystem.addObserver(new MSTempObserver(this));
        weatherMonitoringSystem.addObserver(new MSPressObserver(this));
    }
    /**
     * display the temperature updates this class get
     * @param data temperature
     */
    public void  displayTempreture(int data){
        System.out.println("MonitoringScreen: temperature =" + data +" Celsius");
    }
    /**
     * display the pressure updates this class get
     * @param data pressure
     */
    public void displayPressure(int data){
        System.out.println("MonitoringScreen: pressure =" + data +" millibars");
    }
}

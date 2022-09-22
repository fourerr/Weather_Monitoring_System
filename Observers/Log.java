package WS1.Observers;

import WS1.Observables.Trend;
import WS1.Observables.WeatherMonitoringSystem;

/**
 * class represent the UI-log output that observes sensors and take their information
 */
public class Log {
    /**
     * ctor
     * @param weatherMonitoringSystem the observable element to inform to this class updates
     */
    public Log(WeatherMonitoringSystem weatherMonitoringSystem) {
        System.out.println("Log was created");
        weatherMonitoringSystem.addObserver(new LogPressObserver(this));
        weatherMonitoringSystem.addObserver(new LogPressTrendObserver(this));
    }

    /**
     * display the trend updates this class get
     * @param data trend
     */
    public void  displayTrend(Trend data){
        System.out.println("Log: pressure trend = " + data );
    }

    /**
     * display the pressure updates this class get
     * @param data pressure
     */
    public void displayPressure(int data){
        System.out.println("log: pressure =" + data +" millibars");
    }
}

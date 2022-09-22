package WS1.System;

import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

/**
 *  class main - from here all the system is beginning
 */
public class MainClassWS1
{

    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        Log p_log = new Log(ws);
        
    }
}

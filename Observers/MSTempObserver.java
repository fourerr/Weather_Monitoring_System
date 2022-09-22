package WS1.Observers;
/**
 * class represent the mediator between the MonitoringScreen element and the interface observe in context of temperature sensor
 */
public class MSTempObserver implements Observer{
    MonitoringScreen itsMonitoringScreen;
    /**
     * ctor
     * @param monitoringScreen -MonitoringScreen element
     */
    public MSTempObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSTempObserver was created");
        this.itsMonitoringScreen=monitoringScreen;
    }


    /**
     * method update the MonitoringScreen with the update data from observable
     * @param data -update data
     */
    @Override
    public void update(Object data) {
        itsMonitoringScreen.displayTempreture((Integer) data);

    }
}

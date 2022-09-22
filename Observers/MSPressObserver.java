package WS1.Observers;
/**
 * class represent the mediator between the MonitoringScreen element and the interface observe in context of pressure sensor
 */
public class MSPressObserver implements Observer {
    MonitoringScreen itsMonitoringScreen;
    /**
     * ctor
     * @param monitoringScreen -MonitoringScreen element
     */
    public MSPressObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSPressObserver was created");
        this.itsMonitoringScreen=monitoringScreen;
    }

    /**
     * method update the MonitoringScreen with the update data from observable
     * @param data -update data
     */
    @Override
    public void update(Object data) {
        itsMonitoringScreen.displayPressure((Integer) data);

    }
}

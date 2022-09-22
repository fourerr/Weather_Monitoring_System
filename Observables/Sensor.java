package WS1.Observables;

/**
 * class represent sensor with properties
 */
public abstract class Sensor extends Observable {
    public int lastReading;
    public int interval;
    public String type;

    /**
     * ctor
     * @param type -type of sensor
     * @param interval the time between the measurements
     */
   public Sensor(String type,int interval ){
       this.type=type;
       this.interval=interval;
       System.out.println("Sensor was created");

   }

    /**
     * template method
     * @return integer of the measurements
     */
    protected abstract int read();

    /**
     * method that implements observable pattern and notify changes to observers
     */
    public void check(){
        int temp= read();
        if(lastReading!=temp){
            lastReading=temp;
            notifyObservers(lastReading);
        }
    }
}

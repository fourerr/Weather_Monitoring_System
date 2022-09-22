package WS1.Nimbus1;

import WS1.Observables.AlarmClock;

/**
 * class implements the clock of our system
 */
public class Nimbus1Clock extends AlarmClock {
    long CLOCK_INTERVAL_MILLIS;

    /**
     * ctor of our clock - initialize the clock
     */
    protected Nimbus1Clock()
    {
        System.out.println("Nimbus1Clock was created");
        new Thread("polling Alarm Clock Records")
        {
            public void run()
            {
                System.out.println("running clock thread ---");
                for(int i=0;i<60;i++)
                {
                    //WS1.System.out.println("Thread: " + getName() + " running");
                    tic();
                    try  {

                        Thread.sleep(CLOCK_INTERVAL_MILLIS);}
                    catch (InterruptedException e)
                    { e.printStackTrace(); }
                }
            }
        }.start();
    }

    /**
     * create singleton pattern
     * @return instance of AlarmClock class
     */
    public static AlarmClock theInstance()
    {
        if(null== AlarmClock.instance)
            AlarmClock.instance = new Nimbus1Clock();
        return AlarmClock.instance;
    }
}

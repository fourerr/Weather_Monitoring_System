package WS1.Nimbus1;

import java.util.Random;

/**
 * class supply random integers for testing the value of measurement
 */
public class RandomSupplier {
    private static Random rnd = new Random(1);

    public static Random getRnd() {
        return rnd;
    }
}

package coinchange;

import coinchange.secondstage.Memoizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements the coin change problem
 */
public class CoinChange {

    public static List<Integer> coinValues;
    //   private static final int AMOUNT_TO_PROCESS = 100;
    private static final int AMOUNT_TO_PROCESS = 7500;

    private static int n = 0;

    static {
        coinValues = new ArrayList<>();
        coinValues.add(1);
        coinValues.add(5);
        coinValues.add(10);
        coinValues.add(25);
        coinValues.add(50);
    }

    /**
     * Implement this method, use the Util class.
     *
     * @param valueToChange
     * @param coinValues
     * @return
     */
    public static int change(int valueToChange, List<Integer> coinValues) {

        if (coinValues.isEmpty()) {
            return 0;
        }
        int h = Util.head(coinValues);

        if (valueToChange < 0) {
            return 0;
        }

        if (valueToChange == 0) {
            return 1;
        } else {

            return change(valueToChange - h, coinValues) + change(valueToChange, Util.tail(coinValues));
        }

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Number of solutions:" + Memoizer.memoizedChange(AMOUNT_TO_PROCESS, coinValues));
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken:" + timeTaken);
    }

}

package coinchange;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides utils for determining the head and tail of a list
 */
public class Util {

    /**
     * Returns the first element of the provided list
     *
     * @param <T>
     * @param ts
     * @return
     */
    public static <T> T head(List<T> ts) {
        return ts.get(0);
    }

    /**
     * Returns the tail of the supplied list (n - 1 elements)
     *
     * @param <T>
     * @param ts
     * @return
     */
    public static <T> List<T> tail(List<T> ts) {
        int numberOfTs = ts.size();
        List<T> tail = new ArrayList<>(numberOfTs - 1);
        for (int i = 1; i < numberOfTs; ++i) {
            tail.add(ts.get(i));
        }
        return tail;
    }

}

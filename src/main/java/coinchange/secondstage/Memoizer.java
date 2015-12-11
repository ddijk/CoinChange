package coinchange.secondstage;

import static coinchange.CoinChange.change;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memoizer {

    public static Map<Pair<Integer, List<Integer>>, Integer> memoizedChangeValues = new HashMap<>();

    public static int memoizedChange(int valueToChange, List<Integer> coinValues) {
        Pair<Integer, List<Integer>> key = new Pair(valueToChange, coinValues);
        Integer answer = memoizedChangeValues.get(key);
        if (answer == null) {
            answer = change(valueToChange, coinValues);
            memoizedChangeValues.put(key, answer);
        }
        return answer;
    }
}

package w1_JavaCCTutorial.e32;

import java.util.HashMap;
import java.util.Map;

public class CalculatorMemory {
    private static final Map<String, Integer> map = new HashMap<>();

    public static void add(String variable, int value) throws ArrayStoreException {
        if (map.containsKey(variable))
            throw new ArrayStoreException("Variable already exists");

        map.put(variable, value);
    }

    public static int get(String variable) {
        if (map.get(variable) == null)
            throw new ArrayStoreException("Variable does not exist");

        return map.get(variable);
    }
}

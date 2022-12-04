package Task4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "map2");
        map.put(5, "map5");
        map.put(3, "map3");
        map.put(1, "map1");
        map.put(4, "map4");
        map.put(9, "map9");
        map.put(7, "map7");
        map.put(10, "map10");
        map.put(8, "map8");
        map.put(6, "map6");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }
    }
}
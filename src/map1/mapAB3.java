package map1;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class mapAB3 {
    public static Map<String, String> computeMap(Map<String, String> map) {
        if (map.containsKey("a") && !(map.containsKey("b"))) {
            map.put("b", map.get("a"));

        } else if (map.containsKey("b") && !(map.containsKey("a"))) {
            map.put("a", map.get("b"));

        }
        return map;
    }

    public static void main(String[] args) {

        // Test the static computeMap method in
        Map<String, String> map = new HashMap<>();
         map.put("a", "aaa");
         map.put("c", "cake");
        System.out.println(computeMap(map));
    }
}

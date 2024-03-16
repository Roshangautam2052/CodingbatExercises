package map1;
import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public static Map<String, String> createMapAb4(Map<String, String> map) {
        String aValue;
        String bValue;

        if (map.containsKey("a") && map.containsKey("b")) {
            aValue = map.get("a");
            bValue = map.get("b");
            if (aValue.length() > bValue.length()) {
                map.put("c", aValue);
            } else if (bValue.length() > aValue.length()) {
                map.put("c", bValue);
            } else {
                map.put("a", "");
                map.put("b", "");
            }

        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Aaa");
        map.put("b", "bb");
        map.put("c", "123");

        System.out.println(createMapAb4(map));

    }
}

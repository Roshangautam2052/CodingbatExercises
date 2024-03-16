package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String value : strings){
            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            }
            else {
                map.put(value, 1);
            }

        }
        return map;
    }

    public static void main(String[] args) {
        String[] array = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(array));
    }
}

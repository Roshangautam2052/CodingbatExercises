package Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static  Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(String value: strings){
            if(map.containsKey(value.substring(0,1))){
                map.put(value.substring(0,1), map.get(value.substring(0,1))+value);

            }
            else{
                map.put(value.substring(0,1), value);
            }
            System.out.println(map);
        }
        return map;

    }
    public static void main(String[] args) {
        String[]array = {"salt", "tea", "soda", "toast"};
        System.out.println(firstChar(array));
    }
}

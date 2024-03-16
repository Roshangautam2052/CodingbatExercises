package Map2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(String value : strings){
            map.put(value.substring(0,1), String.valueOf(value.charAt(value.length()-1)));

        }
        return map;
    }

    public static void main(String[]args){
        String[]array = {"code", "bug"};
        System.out.println(pairs(array));

    }
}

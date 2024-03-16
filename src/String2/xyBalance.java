package String2;

public class xyBalance {
    /**
     *This method xyBalance calculates either the string is balanced or
     * not. Here first in the first case if the string contains both
     * x and y then it reverses the string and then returns true if y is
     * located first rather than y
     * @param str
     * @return boolean
     */
    public static boolean xyBalance(String str){
        if(str.contains("y") && str.contains("x")){
            StringBuilder reversed = new StringBuilder(str);
            reversed = reversed.reverse();
            if(reversed.indexOf("x")>reversed.indexOf("y")){
                return true;
            }
            else return false;
        }
        else if(str.contains("y") || !(str.contains("x"))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Testing the output for the input values
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aabxbb"));
        System.out.println(xyBalance("yaaxbb"));

    }
}

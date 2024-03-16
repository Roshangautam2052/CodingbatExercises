package String2;

public class bobThere {
    public static boolean bobThere(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3) {
            if (str.startsWith("b") && str.endsWith("b")) {
                return true;
            }
        } else {
            for (int i = 0; i < str.length() - 2; i++) {
                String sub = str.substring(i, i + 3);
                if (sub.startsWith("b") && sub.endsWith("b")) {
                    return true;
                }

            }


        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(bobThere("b12b1b"));;

    }
}

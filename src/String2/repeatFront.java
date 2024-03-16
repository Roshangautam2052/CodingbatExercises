package String2;

public class repeatFront {
 public static String computeRepeatFront(String str, int n){
     String repeated ="";
     for(int i= n; i>0; i--){
         repeated = repeated + str.substring(0, i);
     }
     return repeated;
 }
    public static void main(String[] args) {
        System.out.println(computeRepeatFront("Chocolate", 4));
    }
}

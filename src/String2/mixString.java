package String2;

public class mixString {
   public static String mixingString(String a, String b){
       int min = Math.min(a.length(),b.length());
       String mix= "";
       for(int i = 0; i < min; i++) {
           mix = mix + a.charAt(i) + b.charAt(i);
       }
        return mix+ a.substring(min) + b.substring(min);
   }

    public static void main(String[]args){
        System.out.println(mixingString("abc", "xyz"));

    }
}

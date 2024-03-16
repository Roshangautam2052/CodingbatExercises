package String2;

public class repeatEnd {

    public static  String repeatEnding( String str, int n){
        String repitition = str.substring(str.length()-n);
        String empty = "";
        for(int i = 0; i<n; i++){
            empty = empty + repitition;
        }
        return empty;
    }
    public static void main(String[] args) {
        //Testing function
        System.out.println(repeatEnding("Hello", 3));

    }
}

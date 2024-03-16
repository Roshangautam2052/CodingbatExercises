package String2;

public class repeatSeperator {
    public static String calculateRepeatedSeparator(String word, String sep, int count){
        String repeated ="";
        for(int i = count; i>0 ; i--){
            if(i==1){
                repeated+= word;
                break;
            }
            repeated += word+sep;
        }
        return repeated;
    }
    public static void main(String[]args){
        System.out.println(calculateRepeatedSeparator("Word", "X", 3));

    }
}

package String2;

public class prefixAgain {
    public static boolean computePrefixAgain(String str, int n){
        String prefix = str.substring(0, n);
        String remainingString = str.substring(n);
        if(remainingString.contains(prefix)){
            return true;

        }

        return false;
    }
    public static void main(String[]args){
        System.out.println(computePrefixAgain("abXYabc", 1));

    }
}

package String2;

public class getSandwich {
    public static String getSandwich(String str) {
        String otherHalf = "";
        int otherHalfIndexOfBread = 0;
        if (str.length() < 10) return otherHalf;
        for (int i = 0; i < str.length() - 5; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                otherHalf = str.substring(i + 5);
                break;
            }
        }
        otherHalfIndexOfBread = otherHalf.lastIndexOf("bread");
        return otherHalf.substring(0,otherHalfIndexOfBread);
    }
    public static void main(String[] args) {
        String val = "breadbreadpotatomulagulapulabread";
            System.out.println(getSandwich(val));
    }
}

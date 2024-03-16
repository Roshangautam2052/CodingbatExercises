package String2;

public class countYZ {
    public static int countYZ(String str) {
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length-2; i++) {
            if(i!= array.length-1){
                if ((array[i]=='y' || array[i]=='z') &&
                        (!Character.isAlphabetic(array[i+1]))) {
                    count++;
                }
            }


        }
        return count;
    }
    public static void main(String[] args) {
            System.out.println(countYZ("fez day"));
    }
}

package String2;

public class sameStarChar {
    public static boolean sameStarChar(String str) {
        boolean flag = false;
        if(str.length()<=2 ||(!str.contains("*")) ){
            flag = true;
            return true;
        }
        char[] array = str.toCharArray();
        for(int i= 1; i<array.length-1; i++){
            if(array[i]=='*'){
                if(array[i+1]==array[i-1]){
                    flag = true;
                }
                else flag = false;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        String test = "*xa*a*b";
        System.out.println(sameStarChar(test));
    }
}

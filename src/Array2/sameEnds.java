package Array2;
import java.util.Arrays;

public class sameEnds {
    public static boolean sameEnds(int[] nums, int len) {
        int[]startArray= new int[len];
        int[]endArray= new int[len];
        int numsLength = nums.length;
        int j = len;
        if(len>0){
            for(int i = 0; i<len; i++){
                startArray[i]= nums[i];
            }
            for(int i = 0; i<len; i++){
                endArray[i] = nums[numsLength-j];
                j--;

            }
            return Arrays.equals(startArray, endArray);

        }
        return true;
    }
    public static void main(String[]args){
        int[] value = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(value, 1));
    }
}

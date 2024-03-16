package Array2;

import java.util.ArrayList;
import java.util.List;

public class Pre4 {
    public static int[] pre4(int[] nums) {
        int i = 0;
        while (nums[i] != 4)
            i+=1;


        int[] arr = new int[i];

        for (int j = 0; j < i; j++)
            arr[j] = nums[j];



        return arr;
    }
    public static void main(String[]args){
        int[] array2 = {1,2,4,1};
        System.out.println(pre4(array2));
    }
}

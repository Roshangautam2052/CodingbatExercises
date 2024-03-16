package Array2;

public class Post4 {
    public static int[] post4(int[] nums) {
        int i = nums.length - 1;
        int j = 0;
        while (nums[i] != 4) {
            i--;
            j++;
        }
        int[] array = new int[j];
        int indexAfter4 = nums.length - j;
        for (int k = 0; k < array.length; k++) {
            array[k] = nums[indexAfter4];
            indexAfter4++;
        }
        return array;


    }

    public static void main(String[] args) {
        int[]array = {2, 4, 1, 2};
        System.out.println(post4(array));
    }
}

package Array2;

public class sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 6){
                while(nums[i] != 7){
                    i++;
                }
            }
            else{
                sum+= nums[i];
            }
        }
        return sum;

    }
    public static void main(String[]args){
        int [] a = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(a));
    }
}

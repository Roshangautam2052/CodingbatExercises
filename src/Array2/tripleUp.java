package Array2;

public class tripleUp {
    public static boolean tripleUpMethod(int[] nums) {
        if (nums.length < 3) return false;
        else {
            for (int i = 0; i <= nums.length - 3; i++) {
                if (Math.abs(nums[i + 2] - nums[i + 1]) == 1 && Math.abs(nums[i + 1] - nums[i]) == 1)  {
                    if (nums[i + 2] > nums[i + 1] && nums[i + 1] > nums[i]) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[] = {1,2,4};
            System.out.println(tripleUpMethod(array));
        }

    }

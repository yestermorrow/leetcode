package primary.array;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum.twoSum(nums, target);
    }
}

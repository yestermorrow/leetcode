package primary.array;

/**
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 0)  {
                if (nums[i+1] != 0) {
                    nums[index] = nums[i + 1];
                    nums[i + 1] = 0;
                    index ++;
                }
            } else {
                index++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {1,0,1};
        moveZeroes.moveZeroes(nums);
    }
}

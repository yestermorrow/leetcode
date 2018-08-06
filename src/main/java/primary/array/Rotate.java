package primary.array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class Rotate {

//    public void rotate(int[] nums, int k) {
//        int length = nums.length;
//        int newk = k % length;
//        int[] newNums = new int[length];
//        for (int i=0; i<nums.length; i++) {
//            int newPosition = (i + newk) % length;
//            newNums[newPosition] = nums[i];
//        }
//        nums = newNums;
//    }
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        // 右移newk + n * length个位置，和右移newk个位置效果是一样的
        int newk = k % length;
        int temp = 0;
        for(int i = 0; i < newk; i++) {
            temp = nums[length - 1];
            for(int j = length - 2; j >= 0; j--) {
                nums[j+1]=nums[j];
            }
            nums[0]=temp;
        }
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        int[] nums = {1,2,3,4,5,6,7};
        rotate.rotate(nums,10);
    }
}

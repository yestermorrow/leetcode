/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {

    public int remove(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int num[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates.remove(num));
    }
}

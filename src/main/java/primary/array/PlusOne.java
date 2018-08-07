package primary.array;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i=length-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // 特殊情况下，每个位置都是9，则扩容
        int[] result = new int[length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] num = {8,9,9,9};
        plusOne.plusOne(num);
    }
}

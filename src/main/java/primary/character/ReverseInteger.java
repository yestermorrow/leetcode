package primary.character;

/**
 * 给定一个32位有符号整数，将整数中的数字进行反转
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321

 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
public class ReverseInteger {
    public int reverse(int x) {
        int tmp = Math.abs(x);
        long result = 0;
        while (tmp > 0) {
            result = result * 10 + tmp%10;
            if (result>Integer.MAX_VALUE)
                return 0;
            tmp = tmp/10;
        }
        return (int)(x>0?result:-result);
    }
}

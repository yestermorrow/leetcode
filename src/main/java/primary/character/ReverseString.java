package primary.character;

/**
 * 功能是将输入的字符串反转过来。
 * 示例：
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class ReverseString {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}

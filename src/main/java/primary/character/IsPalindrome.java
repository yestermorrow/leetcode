package primary.character;

/**
 * Created by wyj on 2018/11/2
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        // 正则去除非字母部分和数字
        s = s.replaceAll("[^a-zA-Z0-9]","");
        // 统一为小写
        s = s.toLowerCase();
        // a等于s的逆转
        String a = new StringBuffer(s).reverse().toString();
        if (a.equals(s))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        String s= "A man, a plan, a canal: Panama";
        isPalindrome.isPalindrome(s);
    }
}

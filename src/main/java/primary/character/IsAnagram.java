package primary.character;

/**
 * Created by wyj on 2018/11/1
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 所有的单词都是一样的， 位数也是一样的
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alpha = new int[26];
        for (int i=0; i<s.length(); i++)
            alpha[s.charAt(i)-'a']++;
        for (int i=0; i<t.length(); i++)
            alpha[t.charAt(i) - 'a']--;
        for (int i : alpha)
            if (i != 0)
                return false;
            return true;
    }

    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        String s = "anagram";
        String t = "nagaram";
        isAnagram.isAnagram(s, t);
    }
}

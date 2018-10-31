package primary.character;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s.length() == 0)
            return -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && chars[i] == chars[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetleetcode";
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        firstUniqChar.firstUniqChar(s);
    }
}
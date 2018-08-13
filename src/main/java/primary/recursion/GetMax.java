package primary.recursion;

/**
 * 递归获取一个数组中的最大值
 *
 * 递归就是一个系统压栈的过程
 *
 * master公式的使用
 * T(N) = a*T(N/b) + O(N^d)
 * 1) log(b,a) > d -> 复杂度为O(N^log(b,a))
 * 2) log(b,a) = d -> 复杂度为O(N^d * logN)
 * 3) log(b,a) < d -> 复杂度为O(N^d)
 *
 * 下面例子T(N) = 2T(N/2) + O(1)
 * 所以计算的时间复杂度为：O(N)
 */
public class GetMax {

    public static int getMax(int[] arr, int L, int R) {
        if (L == R)
            return arr[L];
        int mid = (L + R) / 2;
        int maxLeft = getMax(arr, L, mid);
        int maxRight = getMax(arr, mid + 1, R);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(getMax(arr, 0,arr.length-1));
    }
}
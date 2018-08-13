package primary.sortAndSearch;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * 时间复杂度O(N^2)，额外空间复杂度O(1)
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int tmp = 0;
        if (arr == null || arr.length < 2)
            return null;
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return arr;
    }

    // 对数器
    // 0，有一个你想要测的方法a，
    // 1，实现一个绝对正确但是复杂度不好的方法b，
    // 2，实现一个随机样本产生器
    // 3，实现比对的方法
    // 4，把方法a和方法b比对很多次来验证方法a是否正确。
    // 5，如果有一个样本使得比对出错，打印样本分析是哪个方法出 错
    // 6，当样本数量很多时比对测试依然正确，可以确定方法a已经 正确。

    // for test 绝对正确的排序方法
    public static void rightMethod(int[] arr) {
        Arrays.sort(arr);
    }
    // for test 随机发生器
    public static int[] generateRandomArray(int size, int value) {
        // 生成长度随机的数组,长度在0-size之间
        int[] arr = new int[(int) ((size+1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random());
        }
        return arr;
    }
    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            res[i] = arr[i];
        }
        return res;
    }
    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i ++) {
            int[] arr1 =  generateRandomArray(size, value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            bubbleSort(arr1);
            rightMethod(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "oh no");

    }
}

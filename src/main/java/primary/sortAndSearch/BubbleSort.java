package primary.sortAndSearch;

/**
 * 冒泡排序
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

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,6};
        System.out.println(bubbleSort(arr));
    }
}

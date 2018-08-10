package primary.sortAndSearch;

/**
 * 选择排序
 *
 * 时间复杂度O(N^2)，额外空间复杂度O(1)
 *
 * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return null;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length - 1; j ++) {
                minIndex = arr[j] < arr[j+1] ? j : minIndex;
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,6};
        selectionSort(arr);
    }
}

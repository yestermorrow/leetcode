package primary.sortAndSearch;

/**
 * 插入排序
 *
 * 若数据已排好序则时间复杂度为O(N)，若为乱序则为O(N^2)，若未指定，则一律按数据状况最差来估计算法复杂度
 *
 * 数据序列中插入一个数，但要求插入后此数据序列仍然有序
 */
public class InsertSort {
    public static int[] insertSort (int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        int tmp = 0;
        for (int i = 1 ; i < arr.length; i ++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j--) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,6};
        insertSort(arr);
    }
}

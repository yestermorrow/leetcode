package primary.array;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像

 * 将图像顺时针旋转 90 度
 *
 * 先转置，再逆序
 *
 *
 *
 *   1  2  3  4              1  5  9  13              13  9  5  1
 *   5  6  7  8      转置    2  6  10 14    逆序      14 10  6  2
 *   9  10 11 12   =======>  3  7  11 15  ========>   15 11  7  3
 *   13 14 15 16             4  8  12 16              16 12  8  4
 *
 */
public class RotateImage {
    public void rotate (int[][] matrix) {
        if (matrix == null)
            return;
        int length = matrix.length;
        // 调换对角元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][length - i - 1];
                matrix[length - j - 1][length - i - 1] = tmp;
            }
        }

        // 调换列元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16} };
        rotateImage.rotate(a);
    }
}

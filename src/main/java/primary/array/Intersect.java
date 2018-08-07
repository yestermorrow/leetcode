package primary.array;

import java.util.*;

/**
 * 给定两个数组，写一个方法来计算它们的交集
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result;
        if (nums1.length > nums2.length) {
            result = new int[nums1.length];
        } else {
            result = new int[nums2.length];
        }
        int i=0,j=0,z=-1;
        while(i<nums1.length && j<nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[++z] = nums1[i];
                i++;
                j++;
            } else if(nums1[i]>nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] result1 = new int[z+1];
        for (int k=0; k<=z; k++) {
            result1[k] = result[k];
        }
        return result1;
    }

    public static void main(String[] args) {
        int[] nums2 = {1,2,2,1};
        int[] nums1 = {2};
        Intersect intersect = new Intersect();
        int[] result = intersect.intersect(nums1, nums2);
    }
}

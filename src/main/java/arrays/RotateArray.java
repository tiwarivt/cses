package arrays;

import java.util.Arrays;


/*
 * nums = [2, 3, 4, 5]
 * k = 3
 *
 * 2 3 4 5 <- nums
 * 3 4 5 2
 * 4 5 2 3
 * 5 2 3 4 <- ans
 * */

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int k = 3;
        rotateArray(nums, k);
        System.out.print(Arrays.toString(nums));
    }

    private static void rotateArray(int[] arr, int k) {
        int ln = arr.length;
        k = k % ln;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < ln - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[ln - 1] = temp;
        }
    }
}
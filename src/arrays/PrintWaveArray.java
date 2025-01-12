package arrays;

public class PrintWaveArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {3, 4, 7}
        };
        /*
         * arr[0][0] arr[0][1] arr[0][2]
         * arr[1][0] arr[1][1] arr[1][2]
         * arr[2][0] arr[2][1] arr[2][2]
         * */
        //op should be 1 3 4 2 5 7

        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
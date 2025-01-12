package pattern;

/*
 *  n is odd = 5
 *
 * *
 * **
 * ***
 * **
 * *
 *
 *
 * */


public class NicePattern {
    public static void main(String[] args) {
        int num = 5;
        int trows = num;
        int stars = 1;


        //do work for current row
        for (int row = 1; row <= trows; row++) {
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            //prep for next rows
            System.out.println();
            if (row <= trows / 2) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}
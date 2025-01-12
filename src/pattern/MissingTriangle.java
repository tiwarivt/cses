package pattern;

/*
 * n=4
 * *******
 * *** ***
 * **   **
 * *     *
 * */

public class MissingTriangle {
    public static void main(String[] args) {

        int num = 7;
        int trows = num;

        //print first row (corner case)
        for (int frow = 1; frow <= trows * 2 - 1; frow++) {
            System.out.print("*");
        }
        System.out.println();


        trows = num - 1;
        int stars = num - 1;
        int spaces = 1;
        for (int row = 1; row <= trows; row++) {


            //work for current row

            //work for stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            //work for spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }

            //work for stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }


            //prep for next row
            System.out.println();
            stars--;
            spaces += 2;
        }
    }
}
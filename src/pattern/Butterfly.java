package pattern;

/*
 * n=5 odd always
 *
 * *   *
 * ** **
 * *****
 * ** **
 * *   *
 *
 * */

public class Butterfly {
    public static void main(String[] args) {

        int num = 29;
        int trows = num;
        int stars = 1;
        int spaces = trows - 2;

        for (int row = 1; row <= trows; row++) {


            //current row
            //stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            //spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }


            int sstars = stars;
            if (row == trows / 2 + 1) {
                sstars--;
            }
            //stars
            for (int cst = 1; cst <= sstars; cst++) {
                System.out.print("*");
            }

            //prep for next row
            System.out.println();
            if (row <= trows / 2) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
        }
    }
}
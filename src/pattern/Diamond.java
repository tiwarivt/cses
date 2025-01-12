package pattern;

/*
 *  n is odd = 5
 *
 *   *
 *  ***
 * *****
 *  ***
 *   *
 *
 *
 * */
public class Diamond {
    public static void main(String[] args) {

        int num = 11;
        int trows = num;
        int stars = 1;
        int spaces = num - 1;

        for (int row = 1; row <= trows; row++) {


            //work for current row
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            //prep for next row
            System.out.println();
            if (row <= trows / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }
    }
}
package pattern;

public class IsoTriangle {
    public static void main(String[] args) {
        int num = 5;
        int trows = num;
        int spaces = num - 1;
        int stars = 1;

        for (int row = 1; row <= trows; row++) {



            //work for current row
            //spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            //stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }



            //prep for next row
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}
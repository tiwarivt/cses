package pattern;

public class Triangle {
    public static void main(String[] args) {
        int num = 5;
        int trows = num;
        for (int row = 1; row <= trows; row++) {

            //work for current row
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("*");
            }

            //prep for next row
            System.out.println();
        }
    }
}
package intro;

import java.util.Scanner;

public class SumOfNNatNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        System.out.print("The sum of first " + num + " natural numbers is: " + res);
    }
}
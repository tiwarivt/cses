package intro;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print fibonacci series: ");
        int num = in.nextInt();
        System.out.print("Here is your fibonacci series: ");
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= num; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
        System.out.print(a);
        System.out.println("\nThe " + num + "th fibonacci number is: " + a);
    }
}
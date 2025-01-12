package intro;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Prime: ");
        int num = in.nextInt();
        if (num < 2) {
            System.out.println(num + " is not a prime number");
        } else {
            int cnt = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 1) {
                System.out.println(num + " is not a prime number.");
            } else {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}
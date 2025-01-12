package intro;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int res = 0;

        int d = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            res += (int) Math.pow(digit, d);
            temp /= 10;
        }

        if (res == num) {
            System.out.print(num + " is an Armstrong number.");
        } else {
            System.out.print(num + " is not an Armstrong number.");
        }
    }
}
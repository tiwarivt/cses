package cses;

//https://cses.fi/problemset/task/1068/
public class WeirdAlgorithm {
    public static void weirdAlgo(int n){
        if(n<=0){
            System.out.println("Please enter a valid input.");
        }
        else{
        while(n!=1){
                if (n % 2 == 0) {
                    n /= 2;
                    System.out.print(n + " ");
                } else {
                    n = n*3 + 1;
                    System.out.print(n + " ");
                }
            }
        }
    }
}
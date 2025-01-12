package cses;

//https://cses.fi/problemset/task/1083
public class MissingNumber {
    public static void missingNumber(int[] arr, int n){
        int expectedSum = n * (n + 1) / 2;
        for(int ele: arr){
            expectedSum -= ele;
        }
        System.out.println(expectedSum);
    }
}
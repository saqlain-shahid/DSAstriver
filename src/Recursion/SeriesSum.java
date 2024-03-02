package Recursion;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum2(n));
    }
    static int serSum1(int n){
        if (n==1) return 1;
        return serSum1(n-1) + n;
    }
    static int seriesSum2(int n){
        if (n==1) return 1;

        if ((n&1)==1) return seriesSum2(n-1) + n;

        return seriesSum2(n-1) - n;
    }
}

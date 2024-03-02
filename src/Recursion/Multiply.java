package Recursion;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        mult(n,k);
    }
    static void mult(int n, int k){
        if (k==0){
            return;
        }
        mult(n,k-1);
        System.out.println(n*k);
    }
}

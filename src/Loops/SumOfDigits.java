package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int original_n = n;

        while(n>0){
            sumOfDigits+= n%10;
            n/=10;
        }
        System.out.println("Answer " + original_n + " = " + sumOfDigits);
    }
}

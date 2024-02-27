package Loops;

import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {

                ans -= i;
            } else {

                ans += i;
            }
        }

        System.out.println("Sum: " + ans);
    }
}

package Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        for (int i = 0; i < Math.sqrt(n); i++) {
            if (n%2==0){
                cnt+=2;
            }

        }
        System.out.println(cnt);
    }
}

package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        revS(s);
    }
    static String revS(String s) {
        char[] chArr = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
        return new String(chArr);
    }

}

package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(revS(s,0));
    }
    static String revS(String s, int idx){
        if (idx==s.length()) return "";
        String ans = revS(s,idx+1);
        return ans + s.charAt(idx);
    }
}

package Strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);

        //toggle
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true; // capital
            char ch = s.charAt(i);
            int ascii = (int) ch; //65
            if(ch == ' ') continue;
            if(ascii>=97) flag = false;
            if (flag==true){
                ascii += 32;
                char dh = (char) ascii; //a
                s.setCharAt(i,dh);
            }
            else{
                ascii-=32;
                char dh = (char) ascii; // A
                s.setCharAt(i,dh);
            }
        }
        System.out.println(s);
    }
}

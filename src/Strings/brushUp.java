package Strings;

import java.util.Scanner;

public class brushUp {
    public static void main(String[] args) {
        String n = "saqlainn";
        char res = n.charAt('s');
        System.out.println(res);

    }
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int i=0,j=arr.length-1;
        while(i<j) {
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}

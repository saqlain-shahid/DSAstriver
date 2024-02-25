package Strings;

public class PrintStrings {
    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length() + 1; j++) {
                System.out.print(s.substring(i,j)+ " ");
            }
        }
    }
}

package Strings;

public class SubstringPalindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (Palindrome(str.substring(i,j))==true){

                    System.out.print(str.substring(i,j)+ " ");
                    count++;
                }
            }
        }
        System.out.println("\n Count "+count);
    }
    static boolean Palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (j>i){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

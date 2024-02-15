import java.util.Locale;

public class LCQ125 {
    public static void main(String[] args) {
        String s = " race car";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start = 0;
        int last = s.length()-1;
        while(start<last){
            if(s.charAt(start) == s.charAt(last)){
                start++;
                last--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}

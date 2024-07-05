package BasicQues;

public class P24 {
    public static void main(String[] args) {
        String s = "radar";
        StringBuilder rev = new StringBuilder();
        int sLen = s.length();
        for (int i = sLen - 1; i >= 0 ; i--) {
            rev.append(s.charAt(i));
        }
        if (s.toLowerCase().equals(rev.toString().toLowerCase())){
            System.out.println(s + " is a palindrome");
        } else{
            System.out.println(s + " is not a palindrome");
        }
    }
}

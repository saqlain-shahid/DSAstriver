public class Palindrome {
    public static void main(String[] args) {
        int revN = 0;
        int num = 1331;
        int dup = num;
        while (num>0){
            int lastD = num % 10;
            num/=10;
            revN = (revN * 10) + lastD;

        }
        if (dup == revN){
            System.out.println("true");
        }else {
            System.out.println("false;");
        }
    }
}

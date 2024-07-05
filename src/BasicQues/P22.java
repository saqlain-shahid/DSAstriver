package BasicQues;

public class P22 {
    public static void main(String[] args) {
        int num = 1234, rev = 0;
        while(num != 0){
            int digit = num % 10; //remainder
            rev = rev * 10 + digit; //remainder gets in frontline
            num /= 10; // extract last digit
        }
        System.out.println(rev);
    }
}

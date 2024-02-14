public class ReverseDigit {
    public static void main(String[] args) {
        int rev = 0;
        int num = 9878;
        while (num>0){
            int last = num % 10;
            num /=10;
            rev = (rev * 10) + last;

        }
        System.out.println(rev);

    }
}

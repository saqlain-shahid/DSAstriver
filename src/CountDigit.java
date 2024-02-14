public class CountDigit {
    public static void main(String[] args) {
        int count = 0;
        int num = 8353;
        while(num>0){
            int last = num % 10;
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}

public class CountDigit {
    public static void main(String[] args) {
//        int count = 0;
        int num = 8353;
//        while(num>0){
//            int last = num % 10;
//            count++;
//            num/=10;
//        }
//        System.out.println(count);
        int cnt = (int) Math.log10(num) + 1;
        System.out.println(cnt);
    }

}

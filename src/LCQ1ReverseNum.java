public class LCQ1ReverseNum {
    public static void main(String[] args) {

        System.out.println(rev(-123));
    }
    static int rev(int x){
        int rev = 0;
        while(x!=0){
            int digit = x%10;
            //overflow condition
            if (rev>Integer.MAX_VALUE / 10 || rev<Integer.MIN_VALUE / 10 ){
                return 0;
            }
            rev = (rev*10) + digit;
            x/=10;
        }
        return rev;
    }
}

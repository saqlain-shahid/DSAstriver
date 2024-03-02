package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumRecurse(12345));
    }
    static int sumRecurse(int n){
        if (n>=0 && n<=9){
            return n;
        }
        return sumRecurse(n/10) + n%10;
    }
}

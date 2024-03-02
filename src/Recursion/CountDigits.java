package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(123459));
    }
    static int count(int n){
        if (n<10){
            return 1;
        }
        return count(n/10) + 1;
    }
}

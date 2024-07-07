package Recursion;

public class TailRecursion {
    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
    static int fact(int n, int prod){
        if (n <= 1) return prod;
        return fact(n-1,prod*n);
    }
}

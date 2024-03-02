package Recursion;

public class PowerBase {
    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
    static int pow(int m, int n){
        if (n==0){
            return 1;
        }
        return pow(m,n-1) * m;
    }
}

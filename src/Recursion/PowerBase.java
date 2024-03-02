package Recursion;

public class PowerBase {
    public static void main(String[] args) {
        System.out.println(pow2(5,3));
    }
    static int pow(int m, int n){
        if (n==0){
            return 1;
        }
        return pow(m,n-1) * m;
    }
    //2ns approach
    static int pow2(int p, int q){
        if (q==0) return 1;
        int smallPow = pow2(p,q/2);
        if (q%2==0) return smallPow * smallPow;

        return p * smallPow * smallPow;
    }
}

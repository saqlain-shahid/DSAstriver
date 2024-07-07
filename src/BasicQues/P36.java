package BasicQues;

public class P36 {
    public static void main(String[] args) {
        int res = gcd(59,60);
        System.out.println(res);
    }
    static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}

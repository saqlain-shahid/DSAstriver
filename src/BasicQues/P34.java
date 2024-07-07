package BasicQues;

public class P34 {
    public static void main(String[] args) {
        int n = 20;
        int ans = sumOfN(n);
        System.out.println(ans);
    }
    static int sumOfN(int n){
        if (n == 1 ){
            return 1;
        }
        return n + sumOfN(n-1);
    }
}

public class PrimeNums {
    public static void main(String[] args) {
        int n = 4;
        int cnt = 0;
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                cnt++;
                if ((n/i!=i)){
                    cnt++;
                }
            }
        }
        if (cnt==2){
            System.out.print("Prime");
        }
        else {
            System.out.print("not prime");
        }
    }
}

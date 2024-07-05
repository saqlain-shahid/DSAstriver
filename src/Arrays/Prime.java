package Arrays;

public class Prime {
    public static void main(String[] args) {
        int n = 19;
        int cnt=0;
        for (int i = 1; i*i <=n; i++) {
            if (n%i==0){
                if (i != n/i){
                    cnt+=2;
                }else{
                    cnt++;
                }
            }
        }
        if (cnt==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

package BasicQues;

public class P31 {
    public static void main(String[] args) {
        int n = 60;
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}

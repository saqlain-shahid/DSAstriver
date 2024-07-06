package BasicQues;

public class P29 {
    public static void main(String[] args) {
        int low = 2, high = 100;
        while (low < high){
            if (isPrime(low)){
                System.out.println(low + " ");

            }
            ++low;
        }
    }
    public static boolean isPrime(int num){
        boolean flag = true;
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

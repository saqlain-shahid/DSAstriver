package BasicQues;

public class P33 {
    public static void main(String[] args) {
        int num = 34;
        boolean flag = false;
        for (int i = 2; i <= num/2 ; i++) {
            if (checkPrime(i)){
                if (checkPrime(num - i)){
                    System.out.println(num + " = " + i + " + " + (num - i));
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("cant be expressed as prime sum");
        }
    }
    static boolean checkPrime(int num){
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

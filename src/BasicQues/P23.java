package BasicQues;

public class P23 {
    public static void main(String[] args) {
        double n = Math.pow(2,3);
        double base = 3, power = 3, res = 1;
        while (power != 0){
            res *= base;
            --power;
        }
        System.out.println(res);
    }
}

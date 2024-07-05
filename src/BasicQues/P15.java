package BasicQues;

import java.math.BigInteger;

public class P15 {
    public static void main(String[] args) {
        int num = 30;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
           fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}

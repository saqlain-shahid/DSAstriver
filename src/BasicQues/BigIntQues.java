package BasicQues;

import java.math.BigInteger;

public class BigIntQues {
    public static void main(String[] args) {

        String i1 = "1234567899876543218974584155415425432545125481254875125487512548751482154812548124814";
        String i2 = "9874563217896543217896541235897464154455555555555551222222222222222222222222222122122";

        BigInteger a = new BigInteger(i1);
        BigInteger b = new BigInteger(i2);
        BigInteger sum;
        sum = a.add(b);
        System.out.println(sum);
    }
}
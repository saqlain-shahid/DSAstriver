package BasicQues;

public class P25 {
    public static void main(String[] args) {
        int num = 0;  // You can change this value to test other numbers
        int cnt = 0;

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}

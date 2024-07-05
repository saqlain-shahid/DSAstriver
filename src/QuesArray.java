import java.util.*;

public class QuesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, a, m = Integer.MIN_VALUE;

        while (n-- > 0) {
            if (sc.hasNextInt()) { // Check if there is more input
                a = sc.nextInt();
                if (a > m) {
                    m = a;
                    cnt++;
                }
            } else {
                System.out.println("Error: Insufficient input.");
                return; // Exit the program if input is not complete
            }
        }
        System.out.println(cnt);
    }
}

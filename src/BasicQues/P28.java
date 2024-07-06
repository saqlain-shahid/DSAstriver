package BasicQues;

public class P28 {
    public static void main(String[] args) {
        int l = 100, h = 99999;
        for (int i = l; i < h; i++) {
            int dig = 0;
            int res = 0;
            int orig = i;

            // Calculate the number of digits
            while (orig != 0) {
                orig /= 10;
                ++dig;
            }

            orig = i;  // Reset orig to the original number

            // Calculate the sum of each digit raised to the power of the number of digits
            while (orig != 0) {
                int remain = orig % 10;
                res += Math.pow(remain, dig);  // Use dig instead of 3
                orig /= 10;
            }

            // Check if the number is an Armstrong number
            if (res == i) {
                System.out.println(i + " ");
            }
        }
    }
}

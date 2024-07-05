package Arrays;
class Factors {
    public static void main(String[] args) {

        int n = 10; // given number

        int i; // declaring i in outer scope
        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " "); // numbers  which left remainder 0
        }
// now decrementing i to calculate quotients
        if (i - (n / i) == 1) {
            i--;
        }
        for (; i >= 1; i--) // quotient of numbers which give remainder as 0
        {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }
}
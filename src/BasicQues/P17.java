package BasicQues;

public class P17 {
    public static void main(String[] args) {
        int n = 10, f1 = 0, f2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            int next = f1+f2;
            f1=f2;
            f2=next;
        }
    }
}

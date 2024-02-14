import java.util.*;

public class PrintOFDivisor {
    public static void main(String[] args) {

        int n = 50;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0){
               ls.add(i);
                if ((n/i)!=i){
                    ls.add(n/i);
                }
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
}

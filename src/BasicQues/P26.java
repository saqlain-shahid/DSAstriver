package BasicQues;

public class P26 {
    public static void main(String[] args) {
        int l = 2, h = 50;


        while (l < h){
            boolean prime = true;
            for (int i = 2; i <=l/2 ; i++) {
                if (l % i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime && l > 1){
                System.out.print(l + " ");
            }
            l++;
        }
    }
}

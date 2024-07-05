package BasicQues;

public class P21 {
    public static void main(String[] args) {
        int num = 123456789;
        int cnt = 0;
        while (num != 0){
            num = num/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}

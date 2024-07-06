package BasicQues;

public class P27 {
    public static void main(String[] args) {
        int num = 371, orgNum, remainder, res = 0;
        orgNum = num;
        while (orgNum != 0){
            remainder = orgNum % 10;
            res += Math.pow(remainder,3);
            orgNum /= 10;
        }
        if (res == num){
            System.out.println("armstrong");
        } else System.out.println("not armstrong");
    }
}

public class ArmstrongNum {
    public static void main(String[] args) {
        int sum =0;
        int num=370;
        int dup=num;
        while (num>0){
            int lastD = num%10;
            sum = sum + (lastD*lastD*lastD);
            num/=10;

        }
        if (sum==dup){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

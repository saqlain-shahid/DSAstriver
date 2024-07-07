package BasicQues;

public class P37 {
    public static void main(String[] args) {
        int decimal = 91;
        String s = Integer.toBinaryString(decimal);
        String sb = "101";
        int sbDec = Integer.parseInt(sb,2);
        System.out.println(s);
        System.out.println(sbDec);
    }
}

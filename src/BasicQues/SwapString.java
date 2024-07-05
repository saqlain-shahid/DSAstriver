package BasicQues;

public class SwapString {
    public static void main(String[] args) {
        String s1 = "Saqlain";
        String s2 = "Shahid";
        System.out.println(s1 + " " + s2 + " ");

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        sb1.append(sb2);
        sb2.replace(0,sb2.length(),sb1.substring(0,sb1.length() - sb2.length()));
        sb1.replace(0,sb1.length(), sb1.substring(sb2.length()));

        s1 = sb1.toString();
        s2 = sb2.toString();

        System.out.println(s1 + " " + s2 + " ");


    }
}

package Strings;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("heeloo");
        str.append("world");
        System.out.println(str);
        str.append(100);
        System.out.println(str);

        str.insert(4,"mil");
        System.out.println(str);

        str.deleteCharAt(0);

        System.out.println(str);

        str.reverse();

        System.out.println(str);
    }
}

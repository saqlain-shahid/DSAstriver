public class Strings {
    public static void main(String[] args) {
        String str = "saq";
//        System.out.println(str);
        String gtr = "lain";
        String name = str.concat(gtr);
        System.out.println(name);

//        String str = "physics";
//        for (int i = 2; i < 4; i++) {
//            System.out.print(str.substring(i));
//        }

        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(0,4));

        }


    }
}

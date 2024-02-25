package Strings;

public class LoopInString {
    public static void main(String[] args) {
        //performance issue as it makes new string per iteration
        // "" , "1" , "12" , "123" , "1234" ...
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = s + i;
        }
        System.out.print(s+" ");
    }
}

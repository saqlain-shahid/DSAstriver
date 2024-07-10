package Practice;

import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
        arrr(1,2,3,4,5,6,5,5,5,4,5,44,5,4,4);
        strr("fggfhf","fgdxfgfg","fdxgrzdgfgfgf");
        multiple(5,8.55,"as", "dsdesfsd", "sdfergddge");
    }
    static void arrr(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void strr(String ...str){
        System.out.println(Arrays.toString(str));
    }
    static void multiple(int a, double b, String ...c){
        System.out.print(a + " " + b + " " + Arrays.toString(c) + " ");
    }
}

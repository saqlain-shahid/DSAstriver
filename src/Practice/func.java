package Practice;

public class func {
    public static void main(String[] args) {
        greet();
        System.out.println(sum());
        System.out.println(sum2(2,5));
        String personalised = greet2("Saqlain SHahid");
        System.out.println(personalised);
    }
    static void greet(){
        System.out.println("hello");
    }
    static int sum(){
        int a = 9;
        int b = 8;
        return a+b;
    }
    static int sum2(int a, int b){
        return a+b;
    }
    static String greet2(String name){
        String message = "Hello " + name;
        return message;
    }
}

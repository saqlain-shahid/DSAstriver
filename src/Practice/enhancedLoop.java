package Practice;

public class enhancedLoop {
    public static void main(String[] args) {
        String[] fr = {"Apple", "Banana", "Guava", "Papaya"};
        for(int i = 0; i<fr.length;i++){
            System.out.print(fr[i] + " ");
        }
        System.out.println();
        for(String s : fr){
            System.out.println(s + " enhacnded");
        }
    }
}

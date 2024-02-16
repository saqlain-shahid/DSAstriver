public class Loops {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9};
        NormalLoop(arr);
        EnhancedLoop(arr);
    }
    static void NormalLoop(int[] arr){
        System.out.println("Normal Loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void EnhancedLoop(int[] arr){
        System.out.println("Enhanced Loop");
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}

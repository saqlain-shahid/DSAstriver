public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {2,5,9,71,2,5,52};
        System.out.println("Before reversing");
       for (int num: arr){
           System.out.print(num + " ");
       }
        System.out.println();
       reverseArray(arr);
        System.out.println("After reversing");
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

}

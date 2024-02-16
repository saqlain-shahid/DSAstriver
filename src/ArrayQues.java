public class ArrayQues {
    public static void main(String[] args) {
        //largest element in an array
        int[] arr = {1,5,7,3,8};
        System.out.println(largestElem(arr));

    }
    static int largestElem(int[] arr){
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }
}

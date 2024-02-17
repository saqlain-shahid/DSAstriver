public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,9,87,6,45,1,55};
        int target = 55;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println(target +" is at index no - "+i);
            }
        }
    }

}

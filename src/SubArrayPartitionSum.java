public class SubArrayPartitionSum {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,2,1};
        System.out.println(equalSumPartition(a));
    }
    static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = arraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum==prefSum){
                return true;
            }
        }
        return false;
    }
}

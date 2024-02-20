import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        float arr
//        float[] fr = {2.2f,543.4f,55.3f,0.5f};
//        System.out.println(Arrays.toString(fr));
            //2D array traversal

//        int[][] arr = {{1,2,34},{9,25,3},{9,95,24}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //input 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of cols");
        int c = sc.nextInt();
        int[][] arr = new int[r][c]; // total r*c elements

        //input from user
        System.out.println("Enter " + r*c + " elements");
        for (int i = 0; i < r; i++) { // rows
            for (int j = 0; j < c; j++) { // cols
                arr[i][j] = sc.nextInt();
            }
        }

        //for printing
        System.out.println("2D arrays ");
        for (int i = 0; i < r; i++) { // rows
            for (int j = 0; j < c; j++) { // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

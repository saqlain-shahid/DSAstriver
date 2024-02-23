import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows & col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        int total = r*c;

        System.out.println("Enter " + total + " values");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input mat");
        print(matrix);

        System.out.println("Spiral mat");
        spiralMat(matrix,r,c);
    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralMat(int[][] mat, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1, totalElem = 0;

        while(totalElem < r * c){
            //toprow -> leftcol to rightcol
            for (int i = leftCol; i <=rightCol && totalElem< r * c; i++) {
                System.out.print(mat[topRow][i] + " ");
                totalElem++;
            }
            topRow++;

            //rightCol -> toprow to bottomrow
            for (int j = topRow; j <=bottomRow && totalElem < r * c ; j++) {
                System.out.print(mat[j][rightCol] + " ");
                totalElem++;
            }
            rightCol--;

            // bottomrow -> rightcol to leftcol
            for (int i = rightCol; i >=leftCol ; i--) {
                System.out.print(mat[bottomRow][i] + " ");
                totalElem++;
            }
            bottomRow--;

            //leftcol -> bottomrow to toprow
            for (int j = bottomRow; j >=topRow ; j--) {
                System.out.print(mat[j][leftCol] + " ");
                totalElem++;
            }
            leftCol++;
        }

    }
}

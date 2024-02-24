import java.util.Scanner;

public class GenerateSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMat(n);
        print(matrix);

    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralMat(int n){
        int[][] mat = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int currElem = 1;

        while(currElem <= n * n){
            //toprow -> leftcol to rightcol
            for (int i = leftCol; i <=rightCol && currElem <= n*n; i++) {
                mat[topRow][i] = currElem++;
            }
            topRow++;

            //rightCol -> toprow to bottomrow
            for (int j = topRow; j <=bottomRow && currElem <= n*n ; j++) {
                mat[j][rightCol] = currElem++;
            }
            rightCol--;

            // bottomrow -> rightcol to leftcol
            for (int i = rightCol; i >=leftCol && currElem <= n*n; i--) {
                mat[bottomRow][i] = currElem++;
            }
            bottomRow--;

            //leftcol -> bottomrow to toprow
            for (int j = bottomRow; j >=topRow && currElem <= n*n; j--) {
                mat[j][leftCol] = currElem++;
            }
            leftCol++;
        }
        return mat;

    }
}

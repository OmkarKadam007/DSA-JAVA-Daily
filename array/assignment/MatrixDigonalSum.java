package assignment;

public class MatrixDigonalSum {
    public static void main(String[] args) {
        int[][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        // System.out.println(digonalSum(mat));
        for (int i = 0; i < mat.length; i++) {
            // System.out.print(mat[i][i]);
          
            System.out.print(mat[i][mat.length-i-1]);
        }
    }

    static int digonalSum(int[][] matrix)
            {
                int total = 0;
                int n=matrix.length;

        for (int i = 0; i < n; i++) {
            total += matrix[i][i];               // Main diagonal
            total += matrix[i][n - 1 - i];       // Anti-diagonal
        }

        // If matrix size is odd, subtract the center (it's counted twice)
        if (n % 2 == 1) {
            total -= matrix[n / 2][n / 2];
        }

         return total;


    }
}

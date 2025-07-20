package assignment;

import java.util.Arrays;

public class TransposeofMatrix {
        public static void main(String[] args) {
            int[][] matrix={
                {1,2,3},
                {4,5,6}
            };
            // System.out.println(Arrays.toString(Transpose(matrix)));
            // Transpose(matrix);
            int [][] result=Transpose(matrix);
            for(int[]row:result)
            {
                System.out.println(Arrays.toString(row));
            }
        }



        static int[][] Transpose(int [][]matrix)
        {

           
            int rowCount=matrix.length;
            int colCount=matrix[0].length;
            int [][] ans=new int [colCount][rowCount];
            

            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < colCount; col++) {
                    ans[col][row]=matrix[row][col] ;// assing fliped window 
                }
            }



            // for (int i = 0; i < ans.length; i++) {
            //     for (int j = 0; j < ans[i].length; j++) {
            //         System.out.println(ans[i][j] + " ");
            //     }
            // }
            // System.out.println(Arrays.toString(ans));
            return ans;
        }
}




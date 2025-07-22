package assignment.matrix;

import java.util.Arrays;

public class Transposeofmatrix {
    public static void main(String[] args) {
        int[][] arr={
            // {1,2,3},
            // {4,5,6},
            // {7,8,9}
            {1,2},
            {4,5}

        };

        System.out.println(Arrays.deepToString(Trnspose(arr)));

    }

 static int [][]Trnspose(int [][]arr)
 {
        int row=arr.length;
        int col=arr[0].length;
        int [][]ans=new int[row][col];

        for(int i=0; i<row;i++)
        {
            for (int j = 0; j < col; j++) {
                ans[j][i]=arr[i][j];
            }
        }
        return ans;
 }


}

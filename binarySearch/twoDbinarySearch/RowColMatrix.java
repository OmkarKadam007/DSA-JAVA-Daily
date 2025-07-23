package binarySearch.twoDbinarySearch;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {
        int [][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,24,38,50}
        };
        System.out.println(Arrays.toString(Searchin(arr, 35)));
    }

    static int [] Searchin(int [][] matrix,int target)
    {
        int row=0;
        int col=matrix.length-1;

        while (row<matrix.length && col>=0) {
            if (target==matrix[row][col]) {
                return new int[]{row,col};
            }
            if (matrix[row][col]<target) {
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}

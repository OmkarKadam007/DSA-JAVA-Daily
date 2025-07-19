package assignment;

import java.util.Arrays;

public class FlipinganImage {
        public static void main(String[] args) {
                int [][]arr={
                    {1,1,0},
                    {1,0,1},
                    {0,0,2},
                };
                // System.out.println(Arrays.toString(FlipAndInvertIamge(arr)));
                // System.out.println(Arrays.toString(arr));
                // for(int row=0;row<arr.length;row++)
                // {
                //     for(int col=0; col<arr[row].length;col++)
                //     {
                //         System.out.print(arr[row][col]+" ");
                //     }
                // }
                FlipAndInvertIamge(arr);
        }
    static void FlipAndInvertIamge(int[][] image)
    {
        int rows=image.length;
        int cols=image[0].length;
        int [][]ans=new int [rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=cols-1,k=0; j>=0;j--,k++)
            {
                ans[i][k]=image[i][k]^1;
            }
        }


        // printing 
         for(int row=0;row<ans.length;row++)
                {
                    for(int col=0; col<ans[row].length;col++)
                    {
                        System.out.print(ans[row][col]+" ");
                    }
                }
    }
}

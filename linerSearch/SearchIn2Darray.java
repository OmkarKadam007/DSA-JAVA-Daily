import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr={
            {12,45,67,5,6},
            {2,4,56,89},
            {21,41,63,543},
            {9,78,87,86}
        };

        int target=87;
        System.out.println(Arrays.toString(Search(arr,target)));
        System.out.println(Max(arr));

    }

      static int[] Search(int[][] arr, int target)
      {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                {
                    return new int []{row,col};
                }
            }
        
        }
        return new int[] {-1,-1};
      }
      static int Max(int[][] arr)
      {
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] >max)
                {
                    max=arr[row][col];   
                }
            }
        
        }
        return max;
      }
}

package assignment;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};

        System.out.println(Arrays.toString(Shuffle(arr,3)));

    }


    static int [] Shuffle (int []arr, int n)
    {
            int []  ans=new int[arr.length];
            for(int i=0;i<n;i++)
            {
                ans[2*i]=arr[i];
                ans[2*i+1]=arr[n+i];
            }

        return ans;
    }
}



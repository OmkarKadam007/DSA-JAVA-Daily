package assignment;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int [] nums={-1,4,-2};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
            int n=nums.length;
        
            int [] ans= new int[n*2];
            System.out.println(ans.length);
                // for(int i=0; i<ans.length;i++)
                // {
                //     if(i>n)
                //     {
                //         ans[i]=nums[i-n];
                //         System.out.println("call");
                //     }
                //     else{
                //         ans[i]=nums[i];
                //     }
                //     System.out.println(ans[i]);
                // }

            //     int i=0;
            //     while (i<ans.length) {
            //         if(i>=n)
            //         {
            //           ans[i]=nums[i-n];  
            //           i++;
            //         }else{
            //                 ans[i]=nums[i];
            //                 i++;
            //         }
                    
            //     }
        
            // return ans;
     

                for (int i = 0; i < n; i++) {
                    ans[i] = nums[i];
                    ans[i + n] = nums[i];
                }

    return ans;

    }
}

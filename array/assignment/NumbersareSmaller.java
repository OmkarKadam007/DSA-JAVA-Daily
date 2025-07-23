
// 1365. How Many Numbers Are Smaller Than the Current Number
// 
package assignment;

import java.util.Arrays;

public class NumbersareSmaller {
    public static void main(String[] args) {
        
        int[] nums={7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int [] nums)
    {
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            int counter=0;
            for(int j=0; j<nums.length;j++)
            {   
                
                if(nums[i]>nums[j])
                {
                    counter++;
                }
            }
            ans[i]=counter;
        }
        return ans;

    }
}


package binarySearch.assignment;

import java.util.Arrays;

public class FindFirstansLastPostion {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(fistandlastindex(arr,8)));

    }

    static int[] fistandlastindex(int [] nums, int target)
    {
        int[] ans={-1,-1};
            ans[0]=SearchSide(nums,target,true);
            // if(ans[0] != -1)
            // {
             ans[1]=SearchSide(nums, target, false);
            // }
        return ans;
    }

    static int SearchSide(int[]nums,int target, boolean finsdStartIndex)
    {   
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        
        while (start<=end) {

                int mid=start+(end-start)/2;
                
                if(target <nums[mid])
                {
                    end=mid-1;
                }else if(target>nums[mid])
                {
                    start=mid+1;
                }else{
                    ans=mid;
                    if(finsdStartIndex)
                    {
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
              
               
                
        }

        return ans;
    }

}

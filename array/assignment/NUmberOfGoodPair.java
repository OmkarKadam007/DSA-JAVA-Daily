package assignment;


public class NUmberOfGoodPair {
        public static void main(String[] args) {
            
            int[] nums={1,2,3};
            System.out.println(goodPairs(nums));

        }

        static int goodPairs(int [] nums)
        {   int n=nums.length;
            int count=0;
            for(int i=0; i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(nums[i]==nums[j]){
                        // System.out.println(nums[i]+nums[j]);
                        count++;
                    }
                }
            }
            return count;
        }

}

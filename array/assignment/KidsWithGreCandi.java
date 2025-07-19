package assignment;

import java.util.Arrays;

public class KidsWithGreCandi {
        public static void main(String[] args) {
            int [] candies={4,2,1,1,2};
            int extracandies=1;
            // System.out.println(Maxnum(candies));
            System.out.println(Arrays.toString(kidsWithCandies(candies,extracandies)));

        }

         static boolean [] kidsWithCandies(int[] candies,int extraCandies)
        {
            boolean[] ans=new boolean[candies.length];
            int maxCandies=Maxnum(candies);
            for(int i=0; i<candies.length;i++)
            {
                if(candies[i]+extraCandies>maxCandies)
                {
                    ans[i]=true;
                }else
                {
                    ans[i]=false;
                }
            }
            return ans;
        }

        static int Maxnum(int[] arr)
        {  
                int max=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i] >max)
                    {
                        max=arr[i];
                    }
                }
                return max;
        }
}

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         List<Boolean> ans = new ArrayList<>();
//         int maxCandies = Maxnum(candies);

//         for (int i = 0; i < candies.length; i++) {
//             ans.add(candies[i] + extraCandies >= maxCandies);
//         }

//         return ans;
//     }

//     public int Maxnum(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         for (int val : arr) {
//             if (val > max) {
//                 max = val;
//             }
//         }
//         return max;
//     }
// }


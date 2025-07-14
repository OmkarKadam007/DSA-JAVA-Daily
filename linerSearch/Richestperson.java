public class Richestperson {
    public static void main(String[] args) {
        int [][] accounts={
            {12,3,5},
            {3,4,5},
            {5,6,7}};
        int result=maxmunWealth(accounts);
        System.out.println(result);
    }
    static int maxmunWealth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for(int person=0; person<accounts.length;person++)
        {
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];

            }

            // cahke //
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}

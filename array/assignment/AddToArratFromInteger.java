package assignment;

import java.util.Arrays;

public class AddToArratFromInteger {
    public static void main(String[] args) {
        int [] arrr={9,9,9,9,9,9,9,9,9,9};
        // addToArrayForm(arrr, 181);
        System.out.println(Arrays.toString(addToArrayForm(arrr,k)));
    }
    static int [] addToArrayForm(int [] arr,int k)
    {   
            // to canvrt the arrayto in digits 
            int count=0;

            for(int i=0;i<arr.length;i++)
            {
                count=count*10+arr[i];
            }
            System.out.println(count+181);

            int digit=count+k;
            int temp=digit;
            int recount=0;
            while (temp>0) {
                recount++;
                temp/=10;
            }

        int [] ans=new int[recount];

        for(int i=recount-1;i>=0;i--)
        {
            ans[i]=digit%10;
            digit/=10;
        }

        return ans;
       
    }

    
}

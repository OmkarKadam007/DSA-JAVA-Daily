package assignment;

public class FindnumberWithEvennumberDigit {
    public static void main(String[] args) {
        
            int [] arr={555,901,482,1771};
            System.out.println(FinNUmber(arr));
    }

    static int FinNUmber(int[]arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            // int digit=CountDigit(arr[i]);
            int digit=(int)Math.log10(arr[i])+1;
            
            if(digit%2==0)
            {
                count++;
            }
        }
        return count;
    }

    static int CountDigit(int num)
    {
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
}

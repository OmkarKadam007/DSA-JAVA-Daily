public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={12,345,6,8976,567890};

        // int result=findNUmbers(nums);
        // System.out.println(result);
        System.out.println(digit2(-1));
        
    }
    static int findNUmbers(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }



        return count;
    }


    static boolean even(int num)
    {
        int numberOFDigit=digit(num);

        return numberOFDigit %2==0;
    }
    static int digit(int num)
    {
        if(num<0)
        {
            num=num* -1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }

    static int digit2(int num)

    {
        if(num<0)
        {
            num=num* -1;
        }
        if(num==0)
        {
            return 1;
        }
        return(int)(Math.log10(num)+1);
    }
}

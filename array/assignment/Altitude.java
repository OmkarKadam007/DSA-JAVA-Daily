package assignment;

public class Altitude {
        public static void main(String[] args) {
            int [] gain={-4,-3,-2,-1,4,3,2};
            System.out.println(largestAltitude(gain));
            // largestAltitude(gain);
        }

        static int largestAltitude(int[] gain)
        {
            int currntAltitude=0;
            int[] ans=new int[gain.length+1];
           
            for(int i=0;i<gain.length;i++)
            {
                currntAltitude+=gain[i];
                ans[i+1]=currntAltitude;
            }
            int highstAlti=ans[0];
            for(int i=0;i<ans.length;i++)
            {
                if(highstAlti<ans[i])
                {
                    highstAlti=ans[i];
                }
            }
           
            return highstAlti;
        }

}

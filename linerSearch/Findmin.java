public class Findmin {
        public static void main(String[] args) {
            int [] arr={12,34,56,-7,8,9};
            System.out.println(min(arr));

        }

        static int min(int[] arr)
        {
            if(arr.length ==0)
            {
                return -1;
            
            }
            int ans=arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]<ans)
                {
                    ans=arr[j];
                }
            }
            return ans;
        }
}

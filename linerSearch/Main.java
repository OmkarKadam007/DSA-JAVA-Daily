public class Main {
        public static void main(String[] args) {
            int arr[]={12,34,56,31};
            int result=linerSearch(arr, 12);
            System.out.println(result);
            
        }
            // search the target and retrn element 
            
        static int linerSearch(int[] arr ,int target)
        {
            if(arr.length == 0)
            {
                return -1;
            }

            // run a for lopp
            for(int i=0; i<arr.length;i++)
            {
                int elemet=arr[i];
                if(elemet == target)
                {
                    return i;
                }

            }
            //
            return -1;
        }
    }

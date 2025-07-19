package binarySearch.assignment;

public class Flloor {
        public static void main(String[] args) {
            int []arr={2,4,6,14,16,18};
                int target=19;
                int ans=Srarch(arr, target);
                System.out.println(ans);
        }

         static int Srarch(int[]arr,int target)
        {       
                int start=0;
                int end=arr.length;
                if(target>arr[end-1])
                {
                    return -1;
                }
                
                int mid=0;
                while (start<=end) {
                    mid=start+(end-start)/2;
                    if(target<arr[mid])
                    {
                        end=mid-1;
                    }else if(target>arr[mid])
                    {
                        start=mid+1;
                    }else{
                        return mid;
                    }
                    
                }

                return end;

        }   

}

package binarySearch;

public class Simplesearch {
  public static void main(String[] args) {
        int []arr={-18,-4,0,2,3,4,6,56,78,81};
        int target=5;
        int ans=Srarch(arr, target);
        System.out.println(ans);

  }  

static int Srarch(int [] arr,int target)
{
    int start=0;
    int end=arr.length;
    int mid=0;
    while (start<=end) {
            mid=start+(end-start)/2;
        if(target <arr[mid])
        {
            end=mid-1;
        }else if(target >arr[mid])
        {
            start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
}



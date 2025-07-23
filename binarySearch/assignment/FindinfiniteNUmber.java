package binarySearch.assignment;

public class FindinfiniteNUmber {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,11,12,23};
        int target=8;
        System.out.println(FindRange(arr,target));
    }

    static int FindRange(int[] arr, int targt)
    {
        int start=0;
        int end=1;

        while (targt>arr[end]) {
            int temp=end+1;
            end=end+(end-start)*2;
            start=temp;
        }
        return Serch(arr,targt,start,end);
    }

    static int Serch(int []arr, int target, int start, int end)
    {
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=end-1;
            }else if(target>arr[mid])
            {
                start=end+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

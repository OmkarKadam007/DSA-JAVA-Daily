package binarySearch.assignment;

public class RotationinCount {
    public static void main(String[] args) {
        int [] arr={4,5,6,0,1,2,};
        // int [] arr={4,5,6,7,8};

        System.out.println(countRotaions(arr));
    }

    static int countRotaions(int [] arr)
    {
        int pivit=Pivit(arr);
        System.out.println(pivit);
        return pivit+1;
    }

    static int Pivit(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid<end&& arr[mid]>arr[mid+1])
            {
                return mid;

            }
            if(start<mid&& arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid]<=arr[start]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;

    }
}

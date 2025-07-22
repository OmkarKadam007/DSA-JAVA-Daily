package binarySearch.assignment;

public class FindRoteredSortedArraye {
    public static void main(String[] args) {
        int []arr={1};
        int k=3;
        System.out.println(FindRotetedSorted(arr, k));

    }

    static int FindRotetedSorted(int arr[],int k)
    {
        int pivat=Pivat(arr);
        // If array is not rotated, search entire array
        if(pivat==-1)
        {
            return Search(arr, 0, arr.length-1, k);
        }
            // If pivot element is target
            if(arr[pivat]==k)
            {
                return pivat;
            }
                // Decide which side to search
                if(k>=arr[0])
                {
                    return Search(arr, 0, pivat-1, k); // Search in left size 
                }

                return Search(arr, pivat+1, arr.length-1, k); //search in Right side 

    }


     static int Pivat(int []arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            //case one the my ans is like ex 45670123 ex mid 7 ans mid+1=0 , 7>0 ans is mid 
            if(mid<end&& arr[mid]>arr[mid+1])
            {
                return mid;

            }
            // case  m
            if(mid>start && arr[mid]<arr[mid-1])
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


    static int Search(int [] arr, int start, int end,  int target)
    {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if (target>arr[mid]) {
                    start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}

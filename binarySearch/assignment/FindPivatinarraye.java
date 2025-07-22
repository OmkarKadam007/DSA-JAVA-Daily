package binarySearch.assignment;
// findin the pivat in roteted sorted arraye 
public class FindPivatinarraye {
    public static void main(String[] args) {
        int[] arr={2, 2, 3, 0, 1, 2};
        System.out.println(findPivotWithDuplicates(arr));
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


 static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Case 1: Pivot found — mid > mid+1
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        // Case 2: Pivot found — mid < mid-1
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // Case 3: Duplicates at start, mid, end → can't decide direction
        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            // Shrink from both ends
            if (start < end && arr[start] > arr[start + 1]) return start;
            start++;

            if (end > start && arr[end] < arr[end - 1]) return end - 1;
            end--;
        }
        // Left side is sorted OR left has equal but right is unsorted
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        }
        // Right side might be unsorted
        else {
            end = mid - 1;
        }
    }

    return -1; // No pivot found
}

}



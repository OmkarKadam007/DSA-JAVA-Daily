package binarySearch.assignment;
// Qastion i s1095'
public class SearchMontai {
    public static void main(String[] args) {

        int[] arr={0,1,2,4,2,1};
        int target=3;
        System.out.println(SearchMOntain(arr, target) );

    }

    static int SearchMOntain(int [] arr, int target)
    {
      int peak=PeakOfindex(arr);
      System.out.println(peak);
      int FirstTry=OrderIngonsticSearch(arr,target,0,peak);
      System.out.println(FirstTry);
        if(FirstTry !=-1)
        {
            return FirstTry;
        }
        int SeconsTry=OrderIngonsticSearch(arr,target,peak+1,arr.length-1);

        return SeconsTry;
        // return peak;
    
    }


    static int PeakOfindex(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end) {
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1])
                {
                    end=mid;
                }else{
                    start=mid+1;
                }
        }
        return start;
    }
    static int OrderIngonsticSearch(int[] arr,int target, int start, int end)
    {
        boolean isAsec=arr[start]<arr[end];

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsec)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if (target>arr[mid]) {
                    end=mid-1;

                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

}


 
/*
 * class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        
        // Try finding target in ascending part
        int firstTry = binarySearch(mountainArr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        // Try finding target in descending part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    int findPeakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

 */
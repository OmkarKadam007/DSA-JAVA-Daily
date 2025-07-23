package binarySearch.assignment;

public class FindMinimumRotetedSorted {
        public static void main(String[] args) {
                int[]arr={4,5,6,7,1,2,3};
                System.out.println(MinimunFind(arr));

        }

        static int MinimunFind(int []arr)
        {
                int pivat=Pivat(arr);
                return arr[pivat+1];
        }
        static int Pivat(int[] arr)
        {
                int start=0;
                int end=arr.length-1;
                while (start<=end) {
                          int mid=start+(end-start)/2;

                        if (mid<end&&arr[mid]>arr[mid+1]) {
                                return mid;

                        }
                        if (mid>start&&arr[mid]<arr[mid-1]) {
                                return mid-1;
                        }
                        if (arr[mid]<arr[start]) {
                                end=mid-1;
                        }else{
                                start=mid+1;
                        }
                }
                return -1;
        }
}

public class SearchRarnge {

    public static void main(String[] args) {

        int [] arr={12,45,67,45,46,89,-5,6 ,45};
        int result=linerSearch(arr, -5, 3, 6);
        System.out.println(result);
        
    }


    static int linerSearch(int[] arr, int target , int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        
        for (int i = start; i <= end; i++) {
            int element=arr[i];
            if(element == target)
            {
                return i;
            }

        }
        return -1;
    }
}
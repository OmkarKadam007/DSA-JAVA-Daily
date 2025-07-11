import java.util.Arrays;
import java.util.Scanner;

public class Multiarray {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int [][]arr =new int[3][3];

            System.out.println(arr.length);


        //  input

        for(int row=0; row<arr.length ;row++){
            // System.out.println("input ");
           for(int col=0;col<arr[row].length;col++)
           {
                // System.out.println("clicked ");
                arr[row][col]=in.nextInt();

           }
        }
        // output 
        //      for(int row=0;row <arr.length ;row++){
        //     for(int col=0; col < arr[row].length ;col++)
        //     {
        //         System.out.print(arr[row][col] +"  ");

        //     }
        //     System.out.println();
        // }

        // for(int i=0; i<arr.length ;i++)
        // {
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for (int []a :arr)
        {
            System.out.println(Arrays.toString(a));

        }
        in.close();
}
}

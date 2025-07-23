import java.util.ArrayList;
import java.util.Scanner;

public class Multylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list= new ArrayList<>(4) ;

        Scanner in =new Scanner(System.in); 
        
        // intializatoin  teh list unde list 
         for (int i=0 ; i<3 ; i++)
         {
            list.add(new ArrayList<>());
         }

         for(int i=0 ; i<3; i++)
         {
            list.get(i).add(in.nextInt());

         }
         System.out.println(list);
    }       
}

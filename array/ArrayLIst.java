import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>(5);
        
        // list.add(3);
        // list.add(4);

        // System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        for(int i=0 ; i<5; i++)
        {
            System.out.print(list.get(i));
        }
    }
}

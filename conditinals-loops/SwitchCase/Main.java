import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter youer Fev Frout ");
        // String Fruit= in.next();
            // switch (Fruit) {
            //     case "mango":
            //         System.out.println("Teh Yello fruit");
                    
            //         break;
            //     case "apple":
            //         System.out.println("Red Fruit ");
            //         break;
            //     case "banana":
            //          System.out.println("the Yellow  Crispi Frute");
            //         break;

            
            //     default:
            //         System.out.println("Invalid Fruite Conectio  ");
            //         break;
            // }

            System.out.println("Enter number  ");
            int n=in.nextInt();


            // switch (n) {
            //     case 1:
            //     case 2:
            //     case 3:
            //     case 4:
            //     case 5:
            //         System.out.println("Welcome my dear friend ");
            //         // break ;
            //     case 6:
            //     case 7:
            //         System.out.println("note work the code ");
                    
                    
                    
            
            //     default:
            //         break;
            // }
            switch (n) {
                case 1 -> System.out.println("Your First ");
                case 2 -> System.out.println("SEcond ");
                case 3 -> System.out.println("Third ");
                case 4 -> System.out.println("Fourth");

                    
            }
            in.close();
     }  
}
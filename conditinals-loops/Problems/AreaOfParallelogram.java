import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the  bae");
        double base=in.nextInt();
        System.out.println("Enter the Heigth ");
        double height=in.nextInt();
       if(base <=0 || height <=0)
       {
        System.out.println("Invalid input {lses etry again }");
        in.close();
        return;

       }
        double area=base*height;
        System.out.println("Area od PArallelogram:"+area);
       in.close();
    }   
}

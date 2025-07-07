import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //  Findig the base value 
        // System.out.println("Finding Area of Triangle ");
        // System.out.println("Enter the Base and Height: ");
        // int b = in.nextInt();
        // int h = in.nextInt();
        // int result = (b * h) / 2;
        // System.out.println("Area of Triangle: " + result);
        // in.close(); // optional but good practice


        // finding the on  Heron Formula 
        System.out.println("Finding Area of Triangle ");    
        double a=in.nextInt();
        double b=in.nextInt();
        double c=in.nextInt();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Trangel "+area);


    }
}

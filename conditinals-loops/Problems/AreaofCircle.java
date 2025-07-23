import java.util.Scanner;

public class AreaofCircle {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter radius: ");
            double r = in.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("Area = %.2f\n", area);
            in.close();

        }
}   

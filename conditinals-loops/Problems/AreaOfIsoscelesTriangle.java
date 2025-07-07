import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the Length of the equals sides of the (a):");
        double a=in.nextInt();

        System.out.println("Enter the Length of the base :");
        double b=in.nextInt();
        // heck if the triangle is valid
        if(b >=2*a)
        {
                        System.out.println("Invalid triangle: base is too long for the given sides.");
        }else{

            // calculate the height 
            double height=Math.sqrt(a*a-(b/2)*(b/2));

            // claculate the  area 

            double area=0.5*b*height;
            // 
            System.out.printf("Area of the isosceles triangle: %.2f\n", area);        }
    }
}

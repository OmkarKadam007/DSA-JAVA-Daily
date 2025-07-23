import java.util.Scanner;

public class PerimeterOfCircle {
    static final double PI=Math.PI;

    // Using the radius of the circle:
    public  void Perimeter1 (double r)
    {
        double pc= 2*PI*r;

        System.out.println("Perimeter of the  Circle "+pc);
    }

    public void Perimeter2(double D)
    {
       double Perimeter=PI*D;
        System.out.println("Perimeter of the circle is :"
                           + Perimeter);

    }
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            in.close();
    }   
}

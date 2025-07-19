// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Fibo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter teh fibonach number to be printed  ");
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;
    while (count <= n) {
      int temp = b;

      b = b + a;
      a = temp;
      count++;
      
    }
    System.out.println("fibonach" + b);
    in.close();
  }
}

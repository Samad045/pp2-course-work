import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    
    //int a = sc.nextInt();
    //int b = sc.nextInt();
    int a = Integer.valueOf(args[0]);//Type conversion from string to integer
    int b = Integer.valueOf(args[1]);

    int sum = a + b;
    int difference = a - b;
    int product = a * b;
    int division = a / b;
    int mode = a % b;
    System.out.printf("%d %d %d %d %d", sum, difference, product, division, mode);
    
  }
}
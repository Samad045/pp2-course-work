import java.util.Scanner;

public class Digits 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        var number = scan.nextInt();
        var copynumber = number;


        if(number<0)
        number= -number;

        //number = Math.abs(number);



        int digit;
        int sum = 0, product = 1, count = 0;
        
        while (number > 0)
        {
            digit = number % 10;

            sum += digit;
            product *= digit;
            count ++;

            number /= 10;
        }

        var avg = copynumber != 0 ? (double) sum / count : 0;

        //if(copynumber ==0) product = 0;

        product = copynumber != 0 ? product : 0;
        
        

        System.out.printf
        (
            "Number = %d, Sum = %d, Product = %d, Avg = %.3f\n",
            copynumber, sum, product, avg
        );
    }
}
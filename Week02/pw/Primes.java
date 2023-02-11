import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        var i=2;

        for(;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Number is not Prime");
                return;
            }
        }

        System.out.println("Prime Number");

    }
}
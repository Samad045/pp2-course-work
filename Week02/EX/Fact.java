import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num=sc.nextInt();
        int fact=1;
        if(num>0){
        while (num>=1) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial of this number is "+fact); }
        else if(num==0){
            System.out.println("Factorial of this number is 1");
        }
        else{
            System.out.println("Error!");
        }
    }
}
//[Fact.java] Write a program that takes an integer using command-line arguments and find
//the factorial of that number.
import java.util.Scanner;

public class ArmstrongNumbers {
    public static int  cnt2=0;
    public static void main(String[] args) {

        int x,y;

        Scanner sc=new Scanner(System.in);

        System.out.print("Plese enter  1.st number-> ");
        x=sc.nextInt();

        System.out.print("Plese enter  2.nd number-> ");
        y=sc.nextInt();

        for(var i=x;i<=y;i++){
            check(i);
        }
        System.out.println(cnt2+ " numbers are Armstrong");


    

    
    }

    public static void check(int x){
        
        

        var copy=x;

        var cnt=0;

        while(x>0){
            x/=10;
            cnt++;
        }
       var res=0;
       var copy2=copy;
        for(var i=1;i<=cnt;i++){
            var alfa=(copy%10);

            res+= Math.pow(alfa, cnt);
            copy/=10;

        }
        if(res==copy2){
            System.out.printf("%d is Armstrong Number\n",copy2);
            cnt2++;
        }
    }
}
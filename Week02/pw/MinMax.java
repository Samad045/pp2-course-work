import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        var min=99999999.999;

        var max=-9999999.999;

        while(sc.hasNextDouble()){
            var res=sc.nextDouble();
            if(res>max) max=res;
            if(res<min) min=res;
        }
        System.out.printf("Max value:%.2f, min value: %.2f",max,min);


    }
}
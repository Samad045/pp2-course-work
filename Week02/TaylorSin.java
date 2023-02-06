package Week02;

public class TaylorSin {
    public static void main(String[] args) {
        double x = 5;
        int n = 15;
        double sum = 0;
        for (int i = 0; i < n; i++) {

            long fact = 1;
            for (int j = 2; j <= 2 * i + 1; j++) fact *= j;
//            System.out.println("Fact: " + fact);

            sum += Math.pow(-1, i) * Math.pow(x, 2*i + 1) / fact;
        }
//        System.out.println("By sin function: " + Math.sin(x));
        System.out.println("Calculated: " + sum);
    }
}

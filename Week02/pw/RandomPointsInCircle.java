public class RandomPointsInCircle {
    public static void main(String[] args) {
        
        if(args.length<1){
            System.out.println("Please send the argument");
            return ;
        }

        var cnt=Integer.parseInt(args[0]);
        var i=0;
        while(i!=cnt){
            var x=2*Math.random()-1;
            var y=2*Math.random()-1;
            if(x*x+y*y<=1){
                System.out.printf("x: %f , y: %f\n",x,y);
                i++;
            }
        }
        System.out.println("Program is finished after " + cnt+ " times");


    }
}
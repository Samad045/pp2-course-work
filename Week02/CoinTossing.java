public class CoinTossing{

public static void main(String [] args ){
    if(args.length<1){
        System.out.println("Enter a number.");
    System.exit(1);

    }
    
var numberoftrials = Integer.parseInt(args[0]);
for(int i=1; i<=numberoftrials; i++){
var res = Math.random();
  
  if(res<0.5)

  System.out.println("Head");
  else
  System.out.println("Tail");

} 
 
 }
}
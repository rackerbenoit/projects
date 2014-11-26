import java.util.*;

public class fibonacci{
   public static void main(String [] args)
   {

      System.out.println("Enter amount of numbers for fibonacci sequence to run to");
      Scanner readInput = new Scanner(System.in);
      int n = readInput.nextInt();
      for(int i =1; i<=n; i++){
         System.out.print(Fibonacci(i)+ " ");
      }
      System.out.println();

   }
   public static int Fibonacci(int n)
   {
      if(n==0){
         return 0;
      } else if(n==1){
         return 1;
      }
      else{
         return Fibonacci(n-1)+ Fibonacci(n-2);
      }
   }
}

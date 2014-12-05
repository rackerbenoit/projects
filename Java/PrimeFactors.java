import java.util.*;

public class PrimeFactors{

   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a positive integer: ");
      int n = scanner.nextInt();
      System.out.print("Prime factors: ");
      //find factors of n and check if primes
      for (int i=2;i<=n;i++){
         if (n%i == 0 && isPrime(i)) System.out.print(i+" ");
      }
      System.out.println();
   }
   //reusable method for checking if parameter numbe is prime
   public static boolean isPrime(int p)
   {
      boolean prime = true;
      Prime: for (int i=2; i<=p/2;i++){
         if (p%i==0) {
            prime=false;
            break Prime;
         }
      }
      return prime;
   }
}

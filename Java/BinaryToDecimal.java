import java.util.Scanner;

/*
 * Created by Paul Benoit
 * Binrary to Decimal Converter
 *
 */

 public class BinaryToDecimal
 {
   private static String intToBinary (int n)
   {
     String binary = "";
     int w = n;
     while (w > 0)
     {
       if (w % 2 == 0)
        binary = "0" + binary;
      else
        binary = "1" + binary;

      w = w / 2;
     }
     return binary;
   }


 }

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

   private static String doubleToBinary(double n)
   {
     String binary = "";
     double w = n;
     while ((w % 1) > 0) {
        w *= 2;
        if (((int) w) == 0) {
            binary = binary + "0";
        } else {
            binary = binary + "1";
        }
        w %= 1;
      }
      return binary;
    }

    public static void main(String[] args)
    {
      Scanner in = new Scanner (System.in);
      System.out.println("Enter a 'd' for decimal # of 'b' for binary #: ");
      String c = in.nextLine();
      System.out.println("Enter the #: ");
      while (in.hasNext())
      {
        double n = in.nextDouble();
        int w = (int) n;
        double d = n % 1;
        if (c.equalsIgnoreCase("d"))
          System.out.println(intToBinary(w) + "." + doubleToBinary(d));
        else
        {
          String strw = Double.toString(n) ;
          d = 0;
          for (int i=strw.length()-1; i>=0;i--)
          {
            if (strw.charAt(i) != '.')
            {
              double power = Math.pow(2.0, strw.length() - 2 - i);
              d += power * (strw.charAt(i) - '0');
            }
          }
          System.out.println(d);
        }
      }
    }
 }

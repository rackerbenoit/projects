/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * Authored by Paul Benoit 12/19/2014
 */


import java.util.*;

public class ProjectEulerProblem1
{
    public static void main (String[] args)
    {
      addMultiples(1000);
    }

    public static void addMultiples (int number)
    {
      int sum = 0;
      for(int i = 1; i < number; i++)
      {
         if (i % 3 == 0 || i % 5 == 0)
         {
            sum += i;
         }
      }
      System.out.println ("The sum of all multiples of 3 and 5 under " + number + " is: " + sum);
    }
}

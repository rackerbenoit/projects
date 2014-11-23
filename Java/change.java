import java.util.*;

public class change {

    final static double Quarters = 0.25;
    final static double Dimes = 0.10;
    final static double Nickels = 0.05;
    final static double Pennies = 0.01;

    public static void main(String args[]){
        System.out.println("Enter the total:");
        Scanner in = new Scanner (System.in);
        while (in.hasNext()) {
            double n = in.nextDouble();
            double change = n % 1;
            int numOfQ = 4 * (int) n;
            int numOfD = 0, numOfN = 0, numOfP = 0;
            while (change > 0) {
                if (change >= Quarters) {
                    change -= Quarters;
                    numOfQ++;
                } else if (change >= Dimes) {
                    change -= Dimes;
                    numOfD++;
                } else if (change >= Nickels) {
                    change -= Nickels;
                    numOfN++;
                } else {
                    change -= Pennies;
                    numOfP++;
                }
            }
            System.out.println(numOfQ+" quarters, "+numOfD+" dimes, "+numOfN+" nickles and "+numOfP+" pennies.");
        }
    }
}

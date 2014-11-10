import java.util.Random;
import java.util.Scanner;

/**
 * Created by Paul Benoit
 */

public class CoinFlip {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin: ");
        while(in.hasNext()) {
            int t = in.nextInt();

            Random r = new Random();
            int tails = 0; int heads = 0;
            for (int i=1; i<=t; i++) {
                int f = r.nextInt(2); // 0 = tails , 1 = heads
                if (f == 0)
                    tails++;
                else
                    heads++;
            }
            System.out.println(tails +" tails and "+heads+" heads.");
        }
    }
}

import java.util.*;
import java.io.*;

class football {

  public static void main(String [ ] args)
  {
    double prob = 0;
    double twoTeams = 0;
    double[] topTen = new double[10];

    for(int j = 0; j <= 10; j++)
    {
      prob = p(5,j);
      for(int i = 0; i <= 10; i++)
      {
        twoTeams = prob * p(5,i);
        Arrays.sort(topTen);
        if(twoTeams > topTen[i])
          topTen[i] = twoTeams;
        System.out.println("Probability for the first team to score " + j + " points and the second team to score "
                            + i + " points: " + topTen[i]);
      }
    }

  }

  public static double p(int rounds, int score)
  {
    double prob = 0;
    if(rounds == 1 && score == 0)
      return .5;
    if(rounds == 1 && score == 1)
      return .3;
    if(rounds == 1 && score == 2)
      return .2;
    else if(rounds == 1)
      return 0;

    else
    {
      prob = (p(1,0) * p(rounds - 1, score - 0)) +
      (p(1,1) * p(rounds - 1, score - 1)) +
      (p(1,2) * p(rounds - 1, score - 2));
    }

    return prob;
  }
}

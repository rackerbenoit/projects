import java.util.*;

public class BFS
{
   public static void main (String args[])
   {
      Graph g = new Graph (7, false);
      g.addEdge(0,1);
      g.addEdge(0,2);
      g.addEdge(1,3);
      g.addEdge(2,4);
      g.addEdge(2,3);
      g.addEdge(3,5);
      g.addEdge(4,5);
      System.out.println("The adjacent nodes are: "+search(g, 0, 4));

      Graph g2 = new Graph(7, false);
      g2.addEdge(0,1);
      g2.addEdge(0,2);
      g2.addEdge(1,3);
      g2.addEdge(2,4);
      g2.addEdge(2,3);
      g2.addEdge(3,5);
      g2.addEdge(4,5);
      System.out.println("The node is at a distance of "+dist(g2, 0, 5)+" from the source node.");

      Graph g3 = new Graph(7, false);
      g3.addEdge(0,1);
      g3.addEdge(0,2);
      g3.addEdge(1,3);
      g3.addEdge(2,4);
      g3.addEdge(2,3);
      g3.addEdge(3,5);
      g3.addEdge(4,5);
      System.out.println("The node is at a distance of "+dist(g3, 1, 3)+" from the source node.");

      Graph g4 = new Graph(10, false);
      g4.addEdge(0,2);
      g4.addEdge(0,4);
      g4.addEdge(2,4);
      g4.addEdge(4,6);
      g4.addEdge(4,8);
      g4.addEdge(1,3);
      g4.addEdge(5,7);
      g4.addEdge(7,9);
      g4.addEdge(5,9);
      System.out.println("There are "+ determineUnconnected(g4)+" unconnected clusters.");
   }
}

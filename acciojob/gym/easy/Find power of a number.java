
// Question Link -- https://course.acciojob.com/idle?question=092e96b3-18c0-44bc-8a51-5884ff69871d

import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String args[])
  {
    // your code here
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int n = sc.nextInt ();
    long ans = Solution.Pow (x, n);
    System.out.println (ans);
  }
}
class Solution
{
  static long Pow (int X, int N)
  {
      long pow =1;
     for(int i =1;i<=N;i++){
         pow *=X;
     }
      return pow;
  }
}


// Question Link -- https://course.acciojob.com/idle?question=24c8a038-b2ba-4dae-b1b8-13e44d814b4f

import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        solve(n);

    }

	 static void solve(int n)
    {
        if(n == 0) return;
        solve(n - 1);
        System.out.println("ACCIOJOB");   
    }
}

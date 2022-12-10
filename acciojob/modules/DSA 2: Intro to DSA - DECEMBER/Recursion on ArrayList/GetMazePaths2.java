
// Question Link -- https://course.acciojob.com/idle?question=58bc9224-e806-42d4-a9bf-9f0beff3092a

import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> allPossiblePaths(int n, int m) {

		ArrayList<String> list = new ArrayList<String>();
		allPossiblePathsHelper(m,n,"",list);
		return list;
	}
	  public static void allPossiblePathsHelper(int n, int m , String ans , ArrayList<String> list) {

		  if(n<1 || m<1 ) return;
		  if(n==1&&m==1){
			  list.add(ans);
			  return;
		  }
					
				  allPossiblePathsHelper(n,m-1,ans+"h1",list);
		  		  allPossiblePathsHelper(n-1,m,ans+"v1",list);
		  		  allPossiblePathsHelper(n,m-2,ans+"h2",list);
		  		  allPossiblePathsHelper(n-2,m,ans+"v2",list);
				  allPossiblePathsHelper(n-1,m-1,ans+"d1",list);
		  		  allPossiblePathsHelper(n-2,m-2,ans+"d2",list);
		  
		  
		  
	  }
		  
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}

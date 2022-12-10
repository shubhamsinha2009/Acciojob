
// Question Link -- https://course.acciojob.com/idle?question=2a53222b-7c53-4c9f-af17-549b086a742e

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		ArrayList<String> list = new ArrayList<String>();
		getMazePathsHelper(sr,sc,dr,dc,"",list);
		return list;
		
		
    }
	
	 public static void getMazePathsHelper(int sr, int sc, int dr, int dc, String ans,ArrayList<String> list) {

		 if(sr>dr || sc > dc) return ;
		 if(sr==dr && sc==dc) {
			 list.add(ans); 
			return;
		 }
							 

		 getMazePathsHelper(sr,sc+1,dr,dc,ans+"h",list);
		 getMazePathsHelper(sr+1,sc,dr,dc,ans+"v",list);
		 
	 }
}

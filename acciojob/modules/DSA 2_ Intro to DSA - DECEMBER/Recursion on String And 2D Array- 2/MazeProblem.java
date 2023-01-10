
// Question Link -- https://course.acciojob.com/idle?question=21ed24d5-3798-4152-a4e8-85627d51884c

import java.io.*;
import java.util.*;

public class Main {
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		
		if(sr > dr || sc > dc) return;
		if(sc == dc && sr == dr){
			System.out.println(psf);
			return;
		}
		
			for(int i = 1 ; i<=dc-sc ;i++)
			printMazePaths(sr,sc+i,dr,dc,psf+"h" + i);
		

			for(int i = 1 ; i<=dr-sr ;i++)
			printMazePaths(sr+i,sc,dr,dc,psf +"v" + i);
		
		
			for(int i = 1 ; i<=dc-sc && i<= dr-sr ;i++)
			printMazePaths(sr+i,sc+i,dr,dc,psf+"d" + i);
		
		
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}

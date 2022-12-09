
// Question Link -- https://course.acciojob.com/idle?question=bb073cbd-0873-4607-824f-35edc0041c02

import java.util.*;
import java.io.*;
public class Main {
    public static void aMazePaths(int n, int m, String psf){

		if(n<1 || m<1) return;
        if(n<=1 && m==1) {
			System.out.println(psf);
			return;
		}

		aMazePaths(n,m-1,psf+"h");
		aMazePaths(n-1,m,psf+"v");
		
    }
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);
        aMazePaths(n, m, "");
  }
}

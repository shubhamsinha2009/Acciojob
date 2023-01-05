
// Question Link - https://course.acciojob.com/idle?question=1b4cd50f-dd70-4e3a-a7b9-eb5b95a4c1e6

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    printDI(n);
  }

  public static void printDI(int n) {

	  System.out.println(n);

	  if(n>1){
		  printDI(n-1);
	  }
	  
		System.out.println(n);
	  
  }
}

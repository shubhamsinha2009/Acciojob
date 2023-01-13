
// Question Link -- https://course.acciojob.com/idle?question=0031d548-b5e9-488d-a254-9a9a3536319a

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int m = (int) (Math.pow(n,2));
		int l = (int) (Math.log10(n) + 1);
		int k = (int) (m%(Math.pow(10,l)));
		
		if(n==k)System.out.println("Automorphic Number");
		else System.out.println("Not an Automorphic Number");
 }
}

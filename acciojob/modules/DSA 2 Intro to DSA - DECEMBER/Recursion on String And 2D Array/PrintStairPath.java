
// Question Link -- https://course.acciojob.com/idle?question=c6abdf5c-6981-4f50-8908-0ce691ee6851

import java.io.*;
import java.util.*;

public class Main {
    static void printStairPaths(int n,String s ) {
		if(n<0) return;
        if(n==0){
			System.out.println(s);
			return;
		}
		
		printStairPaths(n-1,s+"1");
		printStairPaths(n-2,s+"2");
		printStairPaths(n-3,s+"3");
		
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }
}

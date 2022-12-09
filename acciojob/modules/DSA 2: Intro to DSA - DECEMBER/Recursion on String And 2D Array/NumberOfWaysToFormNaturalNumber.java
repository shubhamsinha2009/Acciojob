
// Question Link -- https://course.acciojob.com/idle?question=9b236421-7977-48a9-86b7-8890b98a071a

import java.io.*;
import java.util.*;
public class Main {
	
    public static long ways(int n, int i){
		if(i>n) return 0;
		if(n==i)  return 1;
		return ways(n - i, i + 1) + ways(n, i + 1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }
}

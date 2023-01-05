
// Question Link  - https://course.acciojob.com/idle?question=58041d86-041f-4cc4-819f-fd143b6b8490

import java.util.*;

public class Main {
	static void printword(int N)
    {
		if(N==0) return;
        System.out.println("AccioSchool");
		printword(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
	    printword(n);
    }
}

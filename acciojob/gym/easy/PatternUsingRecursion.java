
// Question Link -- https://course.acciojob.com/idle?question=104c46cb-56cb-4783-aab4-a4014f3847b6

import java.util.Scanner;

public class Main {

    static void printPattern(int n) {

		if(n==0) return;
		System.out.print(n+" ");
		printPattern(n-1);
		System.out.print(n+" ");
		printPattern(n-1);
		System.out.print(n+" ");
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}

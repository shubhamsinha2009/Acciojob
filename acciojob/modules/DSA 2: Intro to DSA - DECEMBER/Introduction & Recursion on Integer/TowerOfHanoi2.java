
// Question Link - https://course.acciojob.com/idle?question=e70008e8-edb4-469a-86bf-1c07fd728967

import java.util.Scanner;

public class Main {

    static void towersOfHanoi(int n, char source, char dest, char helper) {

		if(n==1){
			print(n,source,dest);
			return;
		}
		
		towersOfHanoi(n-1,source,helper,dest);
		 print(n,source,dest);
		towersOfHanoi(n-1,helper,dest,source);
		
    }

	static void print(int n , char from, char to){
		System.out.println("Moving ring "+ n +" from "+ from + " to " + to);
			}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'B','C'); // move n disks from A to B
    }
}

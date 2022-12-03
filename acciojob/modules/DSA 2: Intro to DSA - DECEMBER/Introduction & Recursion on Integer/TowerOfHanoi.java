
// Question Link -- https://course.acciojob.com/idle?question=cb2cd5ce-46df-4bea-9ea6-12902858badf

import java.io.*;
import java.util.*;
class Main {
	static void toh(int N, int from, int to, int aux) {
		if(N==1) {
		print(N,from,to); 
		return;
		}
		toh(N-1,from,aux,to);
		print(N,from,to); 
		toh(N-1,aux,to,from);	
    }
	static void print(int N , int from , int to){
		
		System.out.println("move disk "+N+" from rod "+ from +" to rod "+to);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        N = sc.nextInt();

        toh(N, 1, 3, 2);

        sc.close();
    }
}


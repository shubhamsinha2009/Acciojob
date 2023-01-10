
// Question Link - https://course.acciojob.com/idle?question=aa54f234-9dd5-4031-af3d-819afac164f7

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
		int celeb=0;

		for(int i =1 ; i<n;i++){

			if(M[i][celeb] == 0){
				celeb = i;
			}
		}

		for(int i =0 ;i<n;i++){

			
			if( celeb!=i &&  (M[celeb][i] == 1 || M[i][celeb] == 0)){
				return -1;
			}
		}
       return celeb;
    }

}

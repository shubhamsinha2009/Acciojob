
// Question Link - https://course.acciojob.com/idle?question=07b30403-d04c-42f7-b610-8d5d3cac4b15

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();

				System.out.println(largestCoPrimeDivisor(n,m));  
                     
	}
	
	public static int largestCoPrimeDivisor(int n,int m){

			//	return solution(n,m);
		
				return optimisedSol(n,m);
	}
	
	public static int solution(int n,int m){
		 int max = 0;

              for(int i =1 ; i*i <= n ;i++){

                      if(n % i == 0){

                              if(gcd(i,m) == 1){

                                      if(max < i){
                                              max =i;
                                      }
                                    
                              }
                           if(gcd(m,n/i) == 1){
                                 if(max < n/i){
                                              max =n/i;
                                      }
                              }
                              
                      }
                      
              }
					return max;
	}

	public static int optimisedSol(int n , int m){
		//for(int i = gcd(n,m); i!=1 ; i=gcd(n,m)) n/=g;

					int g = gcd(n,m);
					 while (g != 1) {
					      n /= g;
						 g=gcd(n,m);
					}

				return n;
	}
	

        public static int gcd(int a,int b){

                if(b==0) return a;

                return gcd(b,a%b);
                
        }
}

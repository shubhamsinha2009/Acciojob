
// Question Link -- https://course.acciojob.com/idle?question=bdc0d059-aaf9-453d-99c2-85954998dc00

import java.io.*;
import java.util.*;

class Main
{
	public static void printXY(int x,int y){
		System.out.print(x+ " ");
		if(x==y) return;
		printXY(x+1,y);
		
    }
    public static void main(String args[])throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        printXY(x,y);
        
        
    }
}

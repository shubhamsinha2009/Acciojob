
// Question Link - https://course.acciojob.com/idle?question=0231eb71-99d1-4d41-8275-e628423c0170

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int totalItems = sc.nextInt();
                int itemNotEaten = sc.nextInt();

                int items[] = new int[totalItems];

                for(int i =0 ; i<totalItems;i++){
                        items[i] = sc.nextInt();
                        
                }

                int charged = sc.nextInt();
                  int actual = 0;      
                for(int i = 0; i<itemNotEaten;i++){
                        actual += items[i];
                }
               for(int i = itemNotEaten + 1 ; i<totalItems;i++){
                        actual += items[i];
                }

                actual /= 2;

                System.out.println(charged  - actual);
	}
}

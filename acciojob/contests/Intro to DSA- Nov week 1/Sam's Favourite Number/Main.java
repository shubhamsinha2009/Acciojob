

// Question Link - https://course.acciojob.com/idle?question=95e03d41-7c22-4b31-9694-0d2d5c9c59f0

import java.util.*;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
           

            for(int i =0; i< n ; i++){
                    a[i] =sc.nextInt();
                    
            }


            for(int i =n -1; i>= 0 ; i--){
                    if(a[i] == k){
                            System.out.print(i  + " ");
                    }
                    
            }
            
    }
}

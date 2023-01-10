

// Question Link - https://course.acciojob.com/idle?question=a23a6e2d-ff6e-4a3f-b8f2-c7c66980efa6

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int a[] = new int[n];
           

            for(int i =0; i< n ; i++){
                    a[i] =sc.nextInt();
                    
            }

              for(int i =0; i< n ; i++){

                      int sum =0;
                for(int j =i; j< n ; j++){

                        sum += a[j];

                        if(sum > a[n/2]){

                              for(int k =i;  k<= j ; k++){
                                      System.out.print(a[k]+ " ");
                              }
                                System.out.println();
                        }
                        
                    
            }

    }
}
}

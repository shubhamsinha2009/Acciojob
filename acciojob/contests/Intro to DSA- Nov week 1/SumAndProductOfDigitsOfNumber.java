

// Question Link - https://course.acciojob.com/idle?question=6d806ecd-0b7e-4a76-8000-c860750353d5

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sum =0;
            int product = 1;
           

            while(n> 0){

                    int digit = n%10;
                    sum+= digit;
                    product *= digit;

             n/=10;
                    
            }

            System.out.print(sum+product);

    }
}

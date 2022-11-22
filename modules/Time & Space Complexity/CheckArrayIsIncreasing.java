
// Question Link -- https://course.acciojob.com/idle?question=1d2f8f11-374f-41e2-970a-f8f97fa33123

import java.util.*;

class Accio {
    public boolean strictlyIncreasing(int[] arr) {

		// Time Complexity -- O(n)
       // Space Complexity -- O(1)
		
    for(int i = 1 ;i<arr.length; i++){
		int currentElement = arr[i];
		int previousElement = arr[i-1];
		if (currentElement <= previousElement){
                 return false ;
            }
		}
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            Accio Obj = new Accio();
        boolean isInc = Obj.strictlyIncreasing(arr);

			if(isInc){
				 System.out.println("YES");
				} else{
				  System.out.println("NO");
				}

			
            t--;
        }
        sc.close();
    }
}

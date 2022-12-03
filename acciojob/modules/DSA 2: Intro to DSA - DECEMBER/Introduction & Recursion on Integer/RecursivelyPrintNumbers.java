
// Question Link -- https://course.acciojob.com/idle?question=bfe561c3-a478-4769-8fd0-b614f4e0a9c4

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
		printtillN(N);
        
    }

	public static void printtillN(int N) {
		if(N==0) return;
		printtillN(N-1);
		System.out.print(N+" ");
    }
}

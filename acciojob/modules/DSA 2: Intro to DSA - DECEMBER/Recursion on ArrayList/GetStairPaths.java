
// Question Link -- https://course.acciojob.com/idle?question=56fc9309-184a-4723-b8d0-839cbef69b83

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {

		ArrayList<String> list = new ArrayList<>();
			getStairPathsHelper(n,"",list);
		return list;
	}

	public static void getStairPathsHelper(int n,String ans, ArrayList<String> list){

		if(n<0) return ;
		if(n==0) {
			list.add(ans);
			return;
		}

		getStairPathsHelper(n-1,ans+"1",list);
		getStairPathsHelper(n-2,ans+"2",list);
		getStairPathsHelper(n-3,ans+"3",list);
		
		
	}
}


                        
                                

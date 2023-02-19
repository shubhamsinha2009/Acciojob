
// Question Link -- https://course.acciojob.com/idle?question=9b2d5eac-703f-487c-8921-a9a641811594

import java.util.*;
import java.io.*;
 

public class Main {
	public static void bfs(int v, List<List<Integer>> graph,boolean[] visited){
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(v);
		visited[v]=true;

		while(!queue.isEmpty()){
			int size =queue.size();

			for(int i =0;i<size;i++){
				int pop = queue.poll();
					System.out.print(pop+" ");
					
				for(Integer n:graph.get(pop)){
					if(!visited[n]){
						queue.offer(n);
						visited[n]=true;
					}
				
					
				}
				
			}
			
		}
		
	}
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i =0;i<=n;i++) graph.add(new ArrayList<>());

		for(int i =0; i<e;i++){
			int u = sc.nextInt();
			int v = sc.nextInt();

			graph.get(u).add(v);
		}

		boolean[] visited = new boolean[n+1];

		bfs(0,graph,visited);
		// for(int i=0;i<n;i++){
		// 	if(!visited[i]){
				
		// 	}
		// }
		
    }

	
}

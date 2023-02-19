
// Question link -- https://course.acciojob.com/idle?question=bc51d934-d08b-4b7d-a852-2dec91e07bce

import java.util.*;

class Solution {
	public static void dfs(Integer vertex, List<List<Integer>> graph,boolean visited[] ){
		visited[vertex] = true;
		System.out.print(vertex+" ");
		
		List<Integer> neighbours = graph.get(vertex);
		Collections.sort(neighbours);

			for(int n:neighbours){
				if(!visited[n]) dfs(n,graph,visited);
			}
	}
    public static void DFSTraversal(List<List<Integer>> edges, int n) {

		List<List<Integer>> graph = new ArrayList<>();

		for(int i=0;i<n;i++) graph.add(new ArrayList<Integer>());

		for(List<Integer> edge:edges){
			int u = edge.get(0);
			int v = edge.get(1);
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		boolean visited[] = new boolean[n];
		dfs(0,graph,visited);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        Solution ob = new Solution();
        ob.DFSTraversal(ed, n);
    }
}

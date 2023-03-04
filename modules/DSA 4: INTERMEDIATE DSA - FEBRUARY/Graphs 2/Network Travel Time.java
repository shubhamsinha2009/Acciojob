
// Question Link -- https://course.acciojob.com/idle?question=58243169-378c-41f2-8d0f-cef42e547db2

import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n,m,k;
      n=sc.nextInt();
      m=sc.nextInt();
      k=sc.nextInt();
      int[][] a= new int[m][3];
      for(int i=0;i<m;i++){
         int u,v,w;
         u=sc.nextInt();
         v=sc.nextInt();
         w=sc.nextInt();
         a[i][0]=u;
         a[i][1]=v;
         a[i][2]=w;   
      }
      Solution ob = new Solution();
      System.out.println(ob.networkDelayTime(a,n,k));
   }
}
class Vertex{
	int node ;
	int weight;
	Vertex(int node,int weight){
		this.node=node;
		this.weight=weight;
	}
}
class Solution {
       public int networkDelayTime(int[][] times, int N, int K) {

		   // AdjacenyList

		   ArrayList<Vertex>[] graph = new ArrayList[N+1];

		   for(int i=0;i<N+1;i++) graph[i] = new ArrayList<Vertex>();

		   for(int i=0;i<times.length;i++){
			   int u = times[i][0];
			   int v = times[i][1];
			   int w = times[i][2];

			   graph[u].add(new Vertex(v, w));
		   }

		   int[] shortestTime = new int[N+1];
		   Arrays.fill(shortestTime,-1);

		   PriorityQueue<Vertex> pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
		   
			pq.offer(new Vertex(K,0));

		   while(!pq.isEmpty()){
			   Vertex pop = pq.poll();
			   int node = pop.node;
			   int minTime = pop.weight;
			   if(shortestTime[node]!=-1) continue;
			   shortestTime[node]= minTime;

			   for(Vertex edge : graph[node]){
				   if(shortestTime[edge.node]==-1) pq.offer(new Vertex(edge.node,edge.weight+minTime));
			   }
		   }
		int ans = 0;
		   for(int i=1;i<N+1;i++){
			   int m = shortestTime[i];
			  // System.out.print(m+" ");
			   if(m==-1) return -1;
			   ans=Math.max(ans,m);
		   }

		   return ans;
    }
}


// Question Link -- https://course.acciojob.com/idle?question=7f1d060f-853b-4494-8658-62e068d2afe8

import java.util.*;

public class Main
{
    static int[] avoidFlood(int[] rains)
    {
	 Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> zeros = new TreeSet<>();
        int[] res = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                zeros.add(i);
            } else {
                if (map.containsKey(rains[i])) {
                    // find the location of zero that can be used to empty rains[i]
                    Integer next = zeros.ceiling(map.get(rains[i]));
                    if (next == null) return new int[0];
                    res[next] = rains[i];
                    zeros.remove(next);
                }
                res[i] = -1;
				map.put(rains[i], i);
            }
        }
        for (int i : zeros) res[i] = 1;
        return res;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] rains = new int[n];
		for(int i=0; i<n; i++)
		{
		    rains[i] = input.nextInt();
		}
		int[] ans = avoidFlood(rains);
		for(int i=0; i<ans.length; i++)
		{
		    System.out.print(ans[i]);
		    System.out.print(" ");
		}
if(ans.length==0)
System.out.print(" ");
	}
}


// Question Link - https://course.acciojob.com/idle?question=5f0966c6-068f-4ff3-b532-621cfaa4d90c

import java.util.*;

public class Main
{
	static TreeMap<Integer,Integer>[] treeMap;
	static int snapId;
    public static void SnapshotArray(int length) {
		treeMap = new TreeMap[length];
		snapId = 0;

		for(int i =0;i<length;i++){
			treeMap[i] = new TreeMap<Integer,Integer>();
			treeMap[i].put(0,0);
		}
    }

    public static void set(int index, int val) {
			treeMap[index].put(snapId,val);
    }

    public static int snap() {
				return snapId++;
    }

    public static int get(int index, int snap_id) {
		return treeMap[index].floorEntry(snap_id).getValue();
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String temp;
		int param1, param2;
		param1 = input.nextInt();
        SnapshotArray(param1);
        String[] arr = new String[n];
		for (int i = 0; i < n; i++){

            temp = input.next();
		    if(temp.equals("set") || temp.equals("get"))
            {
              param1 = input.nextInt();
              param2 = input.nextInt();
              if(temp.equals("set"))
              {
                  set(param1, param2);
              }
              else{
                  System.out.println(get(param1, param2));
              }
            }
            else{
                System.out.println(snap());
            }
		}
        
	}
}

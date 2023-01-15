
// Question link -- https://course.acciojob.com/idle?question=90be5b8c-a34c-4e31-8945-2c380abce3a2

  
// A Java program to print all anagrams together
import java.util.*;

public class Main {
   
    static List<List<String>> printAnagramsTogether(String strs[],
            int size) {
              HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
      
          
			char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String sb= String.valueOf(ca);
            if(!map.containsKey(sb))map.put(sb,new ArrayList<>());
            List<String> list = map.get(sb);
            list.add(str);
        }
		TreeMap<String,List<String>> sorted = new TreeMap(map);
		
        return new ArrayList(sorted.values());
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();

		List<List<String>> list = printAnagramsTogether(wordArr, n);
		for(List<String> l :list)
				for(String s :l)
					System.out.print(s+" ");
		
    }
}

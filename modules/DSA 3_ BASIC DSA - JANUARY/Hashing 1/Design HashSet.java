
// Question Link -- https://course.acciojob.com/idle?question=86402bd0-eeed-4c05-bf51-6ef08065b6c8

import java.util.*;

class Solution {
	
    List<Integer>[] set; 

    public Solution() {
        set = new LinkedList[750000];
    }
    
    public void add(int key) {

        int i = hashingFunction(key);
        if(set[i] == null){
            List<Integer> list = new LinkedList<>();
            set[i] = list;
        }
        
          if(!contains(key)) set[i].add(key);
    }
    
    public void remove(int key) {
           int i = hashingFunction(key);
        if(contains(key)) set[i].remove(set[i].indexOf(key));
        
    }
    
    public boolean contains(int key) {
         int i = hashingFunction(key);
        if(set[i] == null || set[i].isEmpty()){
            return false;
        }
        if(set[i].indexOf(key) ==-1){
            return false;

        }

        return true;
    }

    public int hashingFunction(int key){
        return key%750000;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}

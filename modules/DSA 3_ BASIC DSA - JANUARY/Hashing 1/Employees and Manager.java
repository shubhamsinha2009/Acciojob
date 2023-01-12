
// Question Link - Employees and Manager

import java.io.*;
import java.util.*;

class Solution {

    public void EmpUnderManager(Map<String, String> emp)
	{
		HashMap<String,Integer> mapOfManager = new HashMap<>();
		for(Map.Entry<String, String> map : emp.entrySet()){

			String employee = map.getKey();
			String manager = map.getValue();

			if(!mapOfManager.containsKey(employee)) mapOfManager.put(employee,0);
			if(employee.equals(manager)) continue;

			int managerIsManager = mapOfManager.getOrDefault(manager,0)+1 ;

			updateAllManagers(manager,managerIsManager,mapOfManager,emp);

		}

		 TreeMap<String, Integer> sorted = new TreeMap<>(mapOfManager);
		
		for(Map.Entry<String, Integer> map : sorted.entrySet()){
			String manager = map.getKey();
			int numberOfEmployees = map.getValue();
			System.out.println(manager+" "+ numberOfEmployees);
		}

		
	}

	public void updateAllManagers(String manager ,int managerIsManager,HashMap<String,Integer> mapOfManager,Map<String, String> emp){

		
		mapOfManager.put(manager,managerIsManager);

		String managerOfManager = emp.get(manager);
		if(managerOfManager.equals(manager)){
			return;
		}else{
			int count = 1 + mapOfManager.getOrDefault(managerOfManager,0);
			updateAllManagers(managerOfManager,count,mapOfManager,emp);
		}

		
		
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp); 
    }
}

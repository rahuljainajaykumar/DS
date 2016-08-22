package Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//To find duplicates in an array.
//print the maximum repetition.

public class Duplicates {
	public static void main(String[] args) {
		int arr[]={-1,0,1,2,3,1,4,5,5,5,6,4,7,8,1,4};
		int max=0;
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int x:arr){
			if(hm.containsKey(x)){
				hm.put(x, hm.get(x)+1);
			}else{
				hm.put(x, 1);
			}
		}
		
//		for (Map.Entry<Integer,Integer> r:hm.entrySet()){	
//				int value = r.getValue();
//				if(value>max){
//					max=value;
//				}	
//				
//		}
		int maximum=(Collections.max(hm.values()));
		System.out.println("");
		for(Map.Entry<Integer,Integer> r:hm.entrySet())
		{
		
			int value = r.getValue();
			if(value==maximum)
			{
				
				System.out.println(r.getKey()+" "+r.getValue());
			}
		}
		
	}
}

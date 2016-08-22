package strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams_HashMap {
public static void main(String[] args) {
	String s1="abc d";
	String s2="cbda ";
	int count=0;
	if(s1.length()!=s2.length()){
		System.out.println("String are not Anagrams1");
	}else{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++){
			if(hm.containsKey(s1.charAt(i))){
				hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
			}else{
				hm.put(s1.charAt(i),1);
			}
		}
		
//		for (Map.Entry<Character,Integer> m:hm.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		for(int i=0;i<s2.length();i++){
			if(hm.containsKey(s2.charAt(i))){
				hm.put(s2.charAt(i),hm.get(s2.charAt(i))-1);
			}else{
			}
		}
//		for (Map.Entry<Character,Integer> m:hm.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		for (Map.Entry<Character,Integer> m:hm.entrySet()){
			count++;
			if(m.getValue()==0 && count==s1.length()){
				System.out.println("String are Anagrams");
			}else if(m.getValue()!=0){
				System.out.println("String are not Anagrams2");
				
			}
		}
	}
	
}
}

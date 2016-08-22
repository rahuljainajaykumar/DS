package strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
public static void main(String[] args) {
	String s="abcdabefgddd";
	
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++){
		if(hs.containsKey(s.charAt(i))){
			hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
		}else{
			hs.put(s.charAt(i),1);
		}
	}
	for (Map.Entry<Character,Integer> m:hs.entrySet()){
		if(m.getValue()>1){
			System.out.print(m.getKey()+" ");
			System.out.println(m.getValue());
		}
	}
}
}

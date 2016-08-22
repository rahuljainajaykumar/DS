package strings;

import java.util.HashMap;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	String s="abcdefabd";
	char result=' ';
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=s.length()-1;i>=0;i--){
		if(hm.containsKey(s.charAt(i))){
			hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
		}else{
			result=s.charAt(i);
			hm.put(s.charAt(i),1);
		}
	}
	System.out.println(result);
}
}

package string_array;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isomorph(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		HashMap<Character,Character> hm=new HashMap<Character,Character>();
		for(int i=0;i<s1.length();i++){
			if(!hm.containsKey(s1.charAt(i))){
				hm.put(s1.charAt(i), s2.charAt(i));
			}else{
				if(hm.get(s1.charAt(i))!=s2.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String input1="egsgvhv";
		String input2="adgD%b%";
		System.out.println(isomorph(input1,input2));
	}
}

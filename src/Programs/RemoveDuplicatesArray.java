package Programs;

import java.util.HashSet;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		char arr[]={'a','b','c','d','f','a','b','g'};
		HashSet<Character> hs=new HashSet<Character>();
		for(char x:arr){
			hs.add(x);
		}
		for(char x:hs){
			System.out.print(x);
		}
	}
}

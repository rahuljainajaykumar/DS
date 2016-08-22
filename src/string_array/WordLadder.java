package string_array;

import java.util.HashSet;
import java.util.Set;

public class WordLadder {
	
	public static int ladder(String start, String end){
		Set<String> se=new HashSet<String>();
		Set<String> str=new HashSet<String>();
		int count=0;
		int result=0;
		se.add("hot");
		se.add("dot");
		se.add("dog");
		se.add("lot");
		se.add("log");
		se.add("cog");
		System.out.println("Set elements");
		for(String s:se){
			System.out.print(s+" ");
		}
		System.out.println(" ");
		while(!start.equals(end)){
			str.add(start);
			for(String temp:se){
				if(!str.contains(temp)){
					System.out.println("temp= "+temp);
					for(int i=0;i<start.length();i++){
						if(start.charAt(i)!=temp.charAt(i)){
							count++;
						}
					}
					System.out.println("count= "+count);
					if(count==1){
						count=0;
						start=temp;
						result++;
						break;
					}
					count=0;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Result= "+ladder("hit","cog"));
	}
}

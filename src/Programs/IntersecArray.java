package Programs;


import java.util.HashSet;

//If array is sorted, this method is not preferable. See the method in class "Common3SortedArray.java"
public class IntersecArray {
public static void main(String[] args) {
	char[] A = {'a', 'b', 'c', 'd'};
	char[] B = {'c', 'd', 'e', 'f'};
	
	HashSet<Character> hs=new HashSet<Character>();
	
	for(char a:A){
		hs.add(a);
		
	}
	for(char b:B){
		if(hs.contains(b)){
			System.out.println(b);
		}
	}
}
}

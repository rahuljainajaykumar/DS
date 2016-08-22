package xad;

public class Palindrome {
public static void main(String[] args) {
	String s="abcba";
	int pt1=0,pt2=s.length()-1;
	while(pt2>pt1){
		if(s.charAt(pt1)!=s.charAt(pt2){
			return false;
		}
		++pt1;
		--pt2;
	}
	return true;
}
}

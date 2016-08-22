package strings;

public class ReverseStringRecrusion {
	public static String reverseString(String s){
	    if (s.length() == 0) 
	         return s;
	    return reverseString(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		String s="a";
		System.out.println(reverseString(s));
	}
}

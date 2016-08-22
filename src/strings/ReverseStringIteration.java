package strings;

import java.util.Arrays;

public class ReverseStringIteration {
	public static String reverseString(String s){
	    if (s.length() == 0) 
	         return s;
	    char[] ca=s.toCharArray();
	    System.out.println(Arrays.toString(ca));
	    int ptr1=0;
	    int ptr2=s.length()-1;
	    char temp=0;
	    for(int i=0;i<s.length();i++){
	    	temp=ca[ptr1];
	    	ca[ptr1]=ca[ptr2];
	    	ca[ptr2]=temp;
	    	ptr1++;
	    	ptr2--;
	    	if(ptr1>=ptr2){
	    		break;
	    	}
	    }
	    return Arrays.toString(ca);
	}
	public static void main(String[] args) {
		String s="abcdfg";
		System.out.println(reverseString(s));
	
	}
}

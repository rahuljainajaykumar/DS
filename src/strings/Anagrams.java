package strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;


//Program to see if two Strings are Anagrams.
public class Anagrams {
public static void main(String[] args) throws UnsupportedEncodingException {
	String s1="ab cd&";
	String s2="cb d&a";
	long prod1=1;
	long prod2=1;
	
	byte[] b1=s1.getBytes("US-ASCII");
	byte[] b2=s2.getBytes("US-ASCII");
	
	System.out.println(Arrays.toString(b1));
	System.out.println(Arrays.toString(b2));
	
	if(s1.length()!=s2.length()){
		System.out.println("String are not Anagrams");
	}else{
	
		for(int i=0;i<s1.length();i++){
			prod1=prod1*b1[i];
			prod2=prod2*b2[i];
		}
	}
	if(prod1==prod2){
		System.out.println("Strings are Anagrams");
	}else{
		System.out.println("String are not Anagrams");
	}
	
	
}
}

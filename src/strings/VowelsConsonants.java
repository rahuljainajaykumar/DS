package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsConsonants {
public static String vowCon(String sin) {
	String s=sin.toLowerCase();
	String output=null;
	String regex="(?i)[A-Z]+";
	int vowel=0;
	int consonant=0;
	for(int i=0;i<s.length();i++){	
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
			vowel++;
		}else if(s.matches(regex)){
			consonant++;
		}
	}
	output="Vowels "+vowel+" Consonants "+consonant;
	return output;
}
public static void main(String[] args) {
	String input1 ="abc123def";
	String input2=null;
	for(int i=0;i<input1.length();i++){
		if()
	}
	System.out.println(vowCon(input2));
	vowConSpl(input);
	
}



public static void vowConSpl(String sin){
	String s=sin.toLowerCase();
	String pattern="(\\d+)([a-z]+)";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(s);
	if(m.find()){
		System.out.println(m.group(0));
		System.out.println(m.group(1));
	}else{
		System.out.println("Not Found!");
	}
	
}
}

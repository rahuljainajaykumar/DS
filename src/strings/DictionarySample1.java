package strings;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DictionarySample1 {
	public static void main(String[] args) {
		
	
	String[] hashInput={"I","like","learning","swimming","gym"};
	HashSet<String> hs=new HashSet<String>();
	for(String a:hashInput){
		hs.add(a);
	}
	
	String s="Ilikelearning";
	String pattern1="(\\Blike\\B)";
	
	Pattern r = Pattern.compile(pattern1);
    Matcher m = r.matcher(s);
    
    boolean b=m.find();
    System.out.println(b);
	String splitArray1=m.group(0);
	//String splitArray2=m.group(1);
	
//	splitArray1[1]=m.group(1);
//	splitArray1[2]=m.group(2);
//	splitArray1[3]=m.group(3);
//	splitArray1[4]=m.group(4);
//		
	
	
	System.out.println(splitArray1);
	//System.out.println(splitArray2);
	
//	for(String as:splitArray){
//		count++;
//		if(!hs.contains(as)){
//			System.out.println("False");
//		}else if(hs.contains(as) && count==splitArray.length){
//			System.out.println("True");
//		}
//	}
	
}
}






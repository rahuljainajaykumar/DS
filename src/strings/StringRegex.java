package strings;

public class StringRegex {
public static void main(String[] args) {
	String s="hi";
	String regex="[hi,hello]+"; //or use, regex="\\d+"
		if(s.matches(regex) ){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

}
}

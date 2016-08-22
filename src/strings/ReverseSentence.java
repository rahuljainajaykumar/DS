package strings;


//this program reverse each word in a sentence without changing their position

public class ReverseSentence {
	
public static String reverseWordByWord(String str){
	        int strLeng = str.length()-1;
	        StringBuilder reverse=new StringBuilder("");
	        StringBuilder temp=new StringBuilder("");

	        for(int i = 0; i <= strLeng; i++){
	            temp.append(str.charAt(i));
	            if((str.charAt(i) == ' ') || (i == strLeng)){
	                for(int j = temp.length()-1; j >= 0; j--){
	                    reverse.append(temp.charAt(j));
	                    if((j == 0) && (i != strLeng))
	                        reverse.append(" ");
	                }
	                temp.setLength(0);;
	            }
	        }
	        return reverse.toString();
	    }
public static void main(String[] args) {
	String str = "hello world";
	String revStr = reverseWordByWord(str);
	System.out.println(revStr);
}
}

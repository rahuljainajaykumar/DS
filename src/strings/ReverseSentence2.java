package strings;


//Progrom to reverse a sentence word by word
public class ReverseSentence2 {
	public static String reverseSentence(String str){
		int strLeng = str.length()-1;
        StringBuilder reverse=new StringBuilder("");
        StringBuilder temp=new StringBuilder("");

        for(int i = strLeng; i >= 0; i--){
            temp.append(str.charAt(i));
            if((str.charAt(i) == ' ') || (i == 0)){
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
String revStr = reverseSentence(str);
System.out.println(revStr);
}
}

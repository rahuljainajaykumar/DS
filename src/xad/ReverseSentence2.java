package xad;


//
public class ReverseSentence2 {
	public static String reverseSentence(String str){
        int strLeng = str.length()-1;
        
        String reverse = "", temp = "";
        
        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
    }
public static void main(String[] args) {
String str = "hello world";
String revStr = reverseSentence(str);
for(int i=revStr.length()-1;i>=0;i--){
	System.out.print(revStr.charAt(i));
}
}
}

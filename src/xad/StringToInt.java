package xad;

//Program to convert String to integer
public class StringToInt {
	public static int getNumber(String number) {
	    int result = 0;
	    for (int i = 0; i < number.length(); i++) {
	        result = result * 10 + number.charAt(i) - '0';
	        System.out.println(result);
	    }
	    return result;
	}
	public static void main(String[] args) {
		String s="-12345";
		//System.out.println('1'-'0');
		int sign=1;
		int output=0;
		if(s.charAt(0)=='-'){
			sign=-1;
		}
		output=getNumber(s.substring(1))*sign;
		System.out.println(output);
		
	}
}

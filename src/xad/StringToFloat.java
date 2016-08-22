package xad;

public class StringToFloat {
	public static float getNumber(String number) {
	    float result = 0;
	    int dotP=1;
	    long tens=1;
	    for (int i = 0; i < number.length(); i++) {
	    	if(number.charAt(i)=='.'){
	    		dotP=number.length()-(i+1);
	    		System.out.println(dotP);
	    		tens=power(10,dotP);
	    		System.out.println(tens);
	    	}else{
	        	result = result * 10 + number.charAt(i) - '0';
	    	}	
	    }
	    result=result/tens;
	    return result;
	}
	public static long power(int num, int p){
		int pow=1;
		for(int i=0;i<p;i++){
			pow=pow*num;
		}
		return pow;
	}
	public static void main(String[] args) {
		String s="12345.35";
		float sign=1;
		float output=0;
		output=getNumber(s)*sign;
		System.out.println(output);
		
	}
}

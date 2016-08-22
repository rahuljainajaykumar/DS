package strings;

public class StringCompressionAlgorithm {

public static void stringCompression(String s){
	char p1=' ',p2=' ';
	int count=0;
	int len=s.length();
	if(len==0){
		System.out.println("Empty String Input");
	}else if(len==1){
		System.out.print(s);
	}else{
		for(int i=0;i<len;i++){
			if(i==0){
				p1=s.charAt(0);
				p2=s.charAt(1);
			}
			else{
				p2=s.charAt(i);
			}
			if(p1==p2){
				count++;
			}else if(p1!=p2){
				if(count>1){
					System.out.print(p1);
					//System.out.print(' ');
					System.out.print(count);
					p1=p2;
					count=1;
				}else{
					System.out.print(p1);
					p1=p2;
				}
				
			}
			if(i==s.length()-1){
				if(count>1){
					System.out.print(p1);
					//System.out.print(' ');
					System.out.print(count);
				}else{
					System.out.print(p1);
				}
			}
		}
	}
}
public static void main(String[] args) {
	String input="abccd";
	stringCompression(input);
}
}

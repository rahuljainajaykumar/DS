package Programs;

public class ZeroSumSubset {
public static void main(String[] args) {
	int arr[] = {4, 2, -3, 1, 6};
	int result=0;
	
	for(int num:arr){
		if(num<=result){
			result=result+num;
		}
	}
	System.out.println(result);
}
}


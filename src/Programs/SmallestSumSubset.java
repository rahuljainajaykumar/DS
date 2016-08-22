package Programs;

//Find the smallest positive integer value that 
//cannot be represented as sum of any subset of a given positive array

public class SmallestSumSubset {
public static void main(String[] args) {
	int arr[] = {1, 1, 1, 1, 2,2, 4, 5, 9};
	int result=1;
	
	for(int num:arr){
		if(num<=result){
			result=result+num;
		}
	}
	System.out.println(result);
}
}

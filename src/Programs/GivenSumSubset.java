package Programs;

public class GivenSumSubset {
public static void main(String[] args) {
	int arr[] = {1, 4, 20, 3, 10, 5};//input
	int sum=33;                      //input
	
	int curr_sum=arr[0];
	int start=0;
	
	for(int i=1;i<=arr.length;i++){
		while(curr_sum>sum && start<i-1){
			curr_sum=curr_sum-arr[start];
			start++;
		}
		if(curr_sum==sum){
			System.out.println("Sum is between"+start+" "+(i-1));
		}
		if(i<arr.length){
			curr_sum=curr_sum+arr[i];
		}
	}
}
}

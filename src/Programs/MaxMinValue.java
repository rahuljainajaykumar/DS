package Programs;

public class MaxMinValue {
	public static void main(String[] args) {
		int arr[]={-1,0,1,2,3,1,4,5,5,5,6,4,7,8,1,4};
		int max=0;
		int min=0;
		for(int x:arr){
			
			if(x>max){
				max=x;
			}
			if(x<min){
				min=x;
			}
		
		}
		System.out.println(max+" "+min);
	}
}

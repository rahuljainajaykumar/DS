package Programs;

//Program to find two highest numbers in array

public class TopTwoNumbersArray {
public static void main(String[] args) {
	int arr[]={20,344,50,35,12,32,44,56,98};
	int max1=0,max2=0;
	
	for(int num:arr){
		if(num>max1){
			max2=max1;
			max1=num;
		}else if(num>max2){
			max2=num;
		}
	}
	System.out.println(max1+"\n"+max2);
}
}

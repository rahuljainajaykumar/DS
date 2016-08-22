package Programs;

import java.util.HashSet;

public class FirstNonRepeatingElementArray {
public static void main(String[] args) {
	int arr[]={0,1,2,3,1,4,5,5,0,5,6,4,7,8,2,1,4};
	HashSet<Integer> hm=new HashSet<Integer>();
	int result=0;
	
	for(int i=arr.length-1;i>=0;i--){
		if(hm.contains(arr[i])){
			hm.add(arr[i]);
		}else{
			result=arr[i];
			hm.add(arr[i]);
		}
	}
	System.out.println(result);
}
}

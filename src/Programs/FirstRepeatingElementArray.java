package Programs;


import java.util.HashSet;

//Program to find first repeating element in an array
public class FirstRepeatingElementArray {
public static void main(String[] args) {
	int arr[]={-1,0,1,2,3,1,4,5,5,5,6,4,7,8,1,4};
	
	HashSet<Integer> hm=new HashSet<Integer>();
	for (int x:arr){
		if(hm.contains(x)){
			System.out.println(x);
			break;
		}else{
			hm.add(x);
		}
	}
}
}
//Alternate: Traverse the array from end. Store the repeating index in a variable.
//It keep overriding and at the last you will get the first repeating index.
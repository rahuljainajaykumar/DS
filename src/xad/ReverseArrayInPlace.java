package xad;

import java.util.Arrays;

//Program to reverse the array in place
public class ReverseArrayInPlace {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int ptr1=0,temp=0;
		int ptr2=arr.length-1;
		for(int i=0;i<arr.length;i++){
			if(ptr1>ptr2){
				break;
			}
			
			temp=arr[ptr1];
			arr[ptr1]=arr[ptr2];
			arr[ptr2]=temp;
			ptr1++;
			ptr2--;
		}
		System.out.println(Arrays.toString(arr));
	}
}

package Programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

//Given an array A[] and a number x, check for pair in A[] with sum as x
//This program has space complexity but reduces time complexity

public class arraySum {
	public static void sumCheck(int a[], int sum){
		int compl=0;
		if(a.length==0){
			System.out.println("Empty Input");
		}
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedList<Integer> al=new LinkedList<Integer>();
		
			
			for(int i:a)
			{  
				   hs.add(i);
			}	
		
		
		for(int num:a)
		{  
			compl=sum-num;
			if(hs.contains(compl) && compl!=num)
			{
				System.out.println(num+" "+compl);
				hs.remove(num);
			
			}
		}
	}
		
	public static void main(String[] args) {
		int arr[]={-1,-2,3,4,5,6,0,10,7,8,9,-12,11};
		//int arr[]={};
		int total=10;
		sumCheck(arr,total);
		
		
		
	}
}

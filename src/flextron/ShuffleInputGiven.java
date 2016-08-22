package flextron;

import java.util.HashSet;
import java.util.Random;


public class ShuffleInputGiven {
	static int temp=0;
	
	public static void shuffle(int a[]){
		Random rnd=new Random();
		int size=a.length;
		int j=0;
		for(int i=0;i<size;i++){
			if(size==1){	
				j=rnd.nextInt(size);
			}else{
				j=rnd.nextInt(size-1);
			}
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;		
		}
		print(a);	
	}
	
	public static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] removeDuplicates(int a[]){
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			s.add(a[i]);
		}
		int [] result = new int[s.size()];
		int k=0;
		for(int i: s)
		{
			result[k]=i;
			k++;
		}
		return result;
	}
	
	public static void main(String args[]){
		//Types of input
		//1.all same input / different inputs
		//2.input with duplicates
		//3.with negative numbers
		//4.with 3%3, 3%0, etc
		int inputGiven[]={1,1};
		inputGiven=removeDuplicates(inputGiven);
		shuffle(inputGiven);
		shuffle(inputGiven);
		shuffle(inputGiven);
		shuffle(inputGiven);
		
	}
	
	
}



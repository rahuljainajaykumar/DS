package string_array;
//Program to find median of two sorted arrays
//time complexity - O(log(m+n))
public class Median {
	
	public static float medianV(int []inputA)
	{
		float median=0;
		if(inputA.length%2==0)
		{
			
			median = (inputA[inputA.length/2]+inputA[inputA.length/2-1])/2.0f;
		}
		else
		{
			median = inputA[inputA.length/2];
		}
		return median;
	}
	
	public static float median(int[] first, int[] second,int startA,int endA,int startB,int endB){
		
	int medianA;
	int medianB;
	float result=0;
	
	int array1Size = endA - startA;
	int array2Size = endB - startB;
	
	if(array1Size == 2)
	{
	return	(Math.max(first[startA],second[startB]) + Math.min(first[startA+1],second[startB+1]))/2.0f;
		
	}
	
	System.out.println("size"+array1Size);
	
	if(medianV(first)==medianV(second))
	{
		
		result = medianV(first);
	}
	else if(medianV(first)>medianV(second))
	{
		if(first.length%2==0)
			return median(first,second,startA,first.length/2,second.length/2,endB);
		
		return median(first,second,startA,first.length/2,second.length/2,endB);
	}
	else if(medianV(first)<medianV(second))
	{
		System.out.println("loop");
		if(first.length%2==0)
			return median(first,second,first.length/2,endA,startB,second.length/2);
		
		return median(first,second,first.length/2,endA,startB,second.length/2);
	}
	return result;
		
		
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b={1,2,8,14};
		System.out.println(median(a,b,0,a.length,0,b.length));
	}
}

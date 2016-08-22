package sorting;

public class InsertionSort {
	public static int[] insertionSort(int[] ar)
	{
	   for (int i=1;i<ar.length; i++)
	   {
	      int index = ar[i]; int j = i-1;
	      while (j >= 0 && ar[j] > index)
	      {
	           ar[j] = ar[j-1];
	           j--;
	      }
	      ar[j] = index;
	   } 
	   return ar;
	}
	public static void main(String[] args) {
		int[] input={29, 64, 73, 20, 25};
		input=insertionSort(input);
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}
	
}

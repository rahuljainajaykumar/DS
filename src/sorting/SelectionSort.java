package sorting;

//Look for smallest number and swap with first element in array.
//Next iteration ignore this first element and start a new array from next element.
public class SelectionSort {
public static int[] selectionSort(int[] arr){
	int min=0;
	int temp=0;
	for(int i=0;i<arr.length-1;i++){
		min=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[min]){
				min=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		
	}
	return arr;
}
public static void main(String[] args) {
	int[] input={29, 64, 73, 20, 25};
	input=selectionSort(input);
	for(int i=0;i<input.length;i++){
		System.out.print(input[i]+" ");
	}
}
}

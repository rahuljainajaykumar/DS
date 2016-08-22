package sorting;
//Compare each adjacent element and swap necessarily to bubble the largest number on the last of array.
//Keep track of sorted part using outer loop.
public class BubbleSort {
void bubbleSort(int[] arr){
	int temp=0;
	for(int i=(arr.length-1);i>=0;i--){
		for(int j=1;j<=i;j++){
			if(arr[j-1]>arr[j]){
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
}

package Test;

import java.util.Arrays;



public class Testing {
	public static void main(String[] args) {
		//int[] a = { 3, 1, 1, 4, 1, 4, 5 };
		//Arrays.sort(a);
		int[] a = { 1,1,1,1,1,2,2,2,2,2 };
		int count = 0;


		for (int i = 0; i < a.length; i++) {
		if (i + 1 < a.length && a[i] == a[i + 1]) {
		count++;
		}

		}

		int[] b = new int[a.length - count]; //we have found out the number of unique elements from [a.lengt-count]
		int c = 0;
		for (int j = 0; j < a.length; j++) {
		if (j + 1 < a.length && a[j] == a[j + 1]) {

		} else {
		b[c] = a[j];
		c++;
		}
		}

		a = b;
		System.out.println(Arrays.toString(a));

		
	}
}

package Programs;

import java.util.Arrays;
//import java.io.*;
//import java.util.*;
//
///*
//    // 1. create an array of 5 integers elements 
//    // 2. assign this array with 1, 2, 3, 4, 5
//    // 3. create a function to reverse the array and print the results 
//    // 4. add try, catch block 
//    // 5. trigger an exception
// */ 
//
////hi Ray. I am done.
//
//class Solution {
//  public static void reverseArray(int arr[]){
//    
//    try{
//      System.out.println("input array: "+Arrays.toString(arr));
//      if(arr.length==0){
//       System.out.println("Empty array input"+"\n");
//      }else{
//          for(int i=0; i< arr.length/2; i++){
//          int temp=arr[i];
//          arr[i]=arr[arr.length -1 -i];
//          arr[arr.length -1 -i]=temp;
//          }
//        System.out.println("reversed array: "+Arrays.toString(arr)+"\n");
//        }   
//    }
//    catch(NullPointerException e){
//        System.out.println("NullPointerException caught");
//        System.out.println(e.getMessage());
//        e.printStackTrace();
//    }
//    catch(Exception e){
//        System.out.println("Exception caught");
//        System.out.println(e.getMessage());
//        e.printStackTrace();
//    }
//    
//    
//  }
//  public static void main(String[] args) {
//    int[] input1={1,2,3,4,5};      //expected input
//    int[] input2={};               //empty input
//    int[] input3={1,3,-1,-3,0};    //negative input
//    int[] input4={1,3,5,7,9};      //odd array
//    int[] input5={2,4,6,8,10};     //even array
//    
//    int a = Integer.MAX_VALUE;     //Integer Max 
//    int b = Integer.MAX_VALUE-1;
//    int c = Integer.MAX_VALUE-2;
//    int d = Integer.MAX_VALUE-3;
//    int[] input6={a,b,c,d};
//                                  
//    
//    int e = Integer.MIN_VALUE;      //Integer Min
//    int f = Integer.MIN_VALUE+1;
//    int g = Integer.MIN_VALUE+2;
//    int h = Integer.MIN_VALUE+3;
//    int[] input7={e,f,g,h};
//    
//    int[] inputNULL=null;          //NULL input
//    
//    reverseArray(input1);
//    reverseArray(input2);
//    reverseArray(input3);
//    reverseArray(input4);
//    reverseArray(input5);
//    reverseArray(input6);
//    reverseArray(input7);
//    reverseArray(inputNULL);
//    
//    
//    
//  }
//}
//
////hi Ray. I am done.


//Program to reverse the array in place
public class ReverseArrayInPlace {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int ptr1=0,temp=0;
		int ptr2=arr.length-1;
		for(int i=0;i<arr.length;i++){
			if(ptr1==ptr2){
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

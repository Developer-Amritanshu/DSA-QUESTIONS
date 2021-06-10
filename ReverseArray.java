package com.amritanshu.dsa.array;


// Method 3 Reverse with swap
 public class ReverseArray {
	public static void main(String[] args) {
		
		// Array with some element
		int[] myArray = {10,22,33,11,88,9,2};
		
		int start = 0;
		int end = myArray.length-1;
		int temp = 0;
		
		// looping and swapping
		while(end>start) {
			temp = myArray[start];
			myArray[start] = myArray[end];
			myArray[end] = temp;
			end--;
			start++;
		}
		
		for(int i:myArray) {
			System.out.print(i+" ");
		}
	}
}

// Method 2 Reverse an array using array list
//	public class ReverseArray {
//	public static void main(String[] args) {
//		// Array List
//		ArrayList<Integer> myArray = new ArrayList<Integer>();
//		myArray.add(10);
//		myArray.add(21);
//		myArray.add(13);
//		myArray.add(14);
//		myArray.add(51);
//		
//		// reverse method and print
//		Collections.reverse(myArray);
//		System.out.println(myArray);
//	}
//}

// Method 1 Reverse with loop
//	public class ReverseArray {
//	public static void main(String[] args) {
//		// Array with some element
//		int[] myArray = {10,22,33,11,88,9,2};
//		
//		// reverse loop and printing
//		for(int i = myArray.length-1;i>=0;i--) {
//			System.out.print(myArray[i]+ " ");
//		}
//	}
//}

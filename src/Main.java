//Sorting with Fixed Size Arrays

//TODO: Sort arrays using selective sort, insertion sort
//		Shell sort, Merge sort, Quick sort, and radix sort
//		All of which must be done twice, with recursion and iteration.

//Lab2 due Wednesday
//HW2 due Monday
//Hw3 due next Monday

import java.util.Random;

public class Main {
	
	private static int[] array;
	
	public static void main(String[] args){
		array = new int[10];
		Random gen = new Random();
		for(int i = 0; i < array.length; i++){
			array[i] = gen.nextInt(10);
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		insertionIterative();
		System.out.println();
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		
	}
	
	public static void selectionIterative(){
		for(int i = 0; i < array.length - 1; i++){
			int smallest = array[i];
			int smallestIndex = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < smallest){
					smallest = array[j];
					smallestIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[smallestIndex];
			array[smallestIndex] = temp;
		}
	}
	
	public static void selectionRecursive(int[] array, int start, int end){
		int smallest = array[start];
		int smallestIndex = start;
		for(int j = start; j < end; j++){
			if(array[j] < smallest){
				smallest = array[j];
				smallestIndex = j;
			}
		}
		int temp = array[start];
		array[start] = array[smallestIndex];
		array[smallestIndex] = temp;
		if(start + 1 < end)
			selectionRecursive(array, start + 1, end);
	}
	
	public static void insertionIterative(){
		int[] array2 = new int[array.length];
		for(int i = 0; i < array.length; i++){
			int smallest = array[i];
			int smallestIndex = i;
			for(int j = 0; j < array.length; j++){
				if(array[j] < smallest){
					smallest = array[j];
					smallestIndex = j;
				}
			}
			array2[i] = array[smallestIndex];
		}
		array = array2;
	}
	
	public static void insertionRecursive(){
		
	}
	
	public static void shellIterative(){
		
	}
	
	public static void shellRecursive(){
		
	}
	
	public static void mergeIterative(){
		
	}
	
	public static void mergeRecursive(){
		
	}
	
	public static void quickIterative(){
		
	}
	
	public static void quickRecursive(){
		
	}
	
	public static void radixIterative(){
		
	}
	
	public static void radixRecursive(){
		
	}
}

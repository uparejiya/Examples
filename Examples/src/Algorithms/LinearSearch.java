package Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] array = new int[size];
		
		for(int i=0;i<size;i++){
			array[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		int numberToFind = Integer.parseInt(bufferedReader.readLine());
		System.out.println("position of "+numberToFind+": "+linearSearch(array,size,numberToFind));
		
	}
	
	public static int linearSearch(int[] arr, int size, int number){
		for(int i=0;i<size;i++){
			if(arr[i]==number){
				return i;
			}
		}
		return -1;
	}

}

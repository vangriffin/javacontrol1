package javaTypesHwk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		System.out.println("Write a binary number (1's and 0's")
			to be converted into decimal.");"
		Scanner sc = new Scanner(System.in);
		int[] binaryNumbers = assignValue(sc);
		int answer = binary(binaryNumbers);
		
		for (int i = 0; i < binaryNumbers.length/2; ++i) {
			int tempArray = binaryNumbers[i];
			binaryNumbers[i] = binaryNumbers[binaryNumbers.length -i -1];
			binaryNumbers[binarynumbers.length -i - 1] = tempArray;
		}
		System.out.println(Arrays.toString(binaryNumbers).replace
				(",","").replace("[", "").replace("]", "") + "is" +
				answer + "in decimal");
	}
	
	public static int[] assignValue(decimal.Scanner sc) {
		
		String arrayNumber = sc.nextLine();
		int arraySize = arrayNumber.length();
		char[] digits = arrayNumber.toCharArray();
		int[] binaryArray = new int[arraySize];
		
		for (int i = 0; i < binaryArray.length; ++i) {
			binaryArray[i] = (int) digits[i] - 48;
		}
		return binaryArray;
	}
	
	public static int binary(int[] array) {
		
		int sum = 0;
		
		for (int i = 0; i < array.length/2; ++i) {
			int tempArray = array[i];
			array[i] = array[array.length -i -1];
			array[array.length -i -1] = tempArray;
		}
		
		for (int i = 0; i < array.length; ++i) {
		
		
		
	



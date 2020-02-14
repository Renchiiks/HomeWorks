package lecture7_homework;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How much numbers?");

		int userDefinedArrayLength = sc.nextInt();
		int userArray[] = new int[userDefinedArrayLength];

		System.out.println("Input values: ");

		for (int i = 0; i < userDefinedArrayLength; i++) {

			userArray[i] = sc.nextInt();
		}
		System.out.println("Your array: "+ printArray(userArray));

	}

	public static String printArray(int[] array) {
		String allValues = "";
		for (int i : array) {
			allValues = allValues + i+ " ";
		}
		return allValues;
	}
	
	
}

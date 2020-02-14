import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import jdk.jshell.execution.Util;

public class RanomGroups {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] asd = new int[10];
		System.out.println(asd[0]);

		System.out.println("How much persons?");
		int numberOfPersons = sc.nextInt();
		String[] persons = new String[numberOfPersons];

		System.out.println("Enter " + numberOfPersons + " names: ");
		for (int i = 0; i < persons.length; i++) {
			persons[i] = sc.next();

		}

		List<String> arrayPersonasToList = Arrays.<String>asList(persons);
		Collections.shuffle(arrayPersonasToList);

		Random random = new Random();

		int[] twoOrThree = new int[persons.length / 2 ];
		int sum = 0;
		int i = 0;

		while (sum != persons.length) {
			int randomTwoOrThree = random.nextInt(2) + 2;
			sum = sum + randomTwoOrThree;
			if (sum > persons.length) {
				sum = 0;
				i = 0;
				twoOrThree = new int[persons.length / 2 ];
			} else {
				twoOrThree[i] = randomTwoOrThree;
				i++;
				//System.out.println(randomTwoOrThree);
			}

		}
		int pozicija = 0;
		for (int j = 0; j < twoOrThree.length; j++) {
			if (twoOrThree[j] != 0){
				System.out.println("Komanda " + (j + 1));
				int fixedPos = pozicija;
				for(int k = fixedPos; k < fixedPos+twoOrThree[j]; k++ ) {
					System.out.println(arrayPersonasToList.get(k));
					pozicija++;
				}
			}
		} 

		

	}

}

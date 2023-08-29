package Section3.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 29.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array1Count = in.nextInt();
		int[] array1 = new int[array1Count];
		for (int i = 0; i < array1Count; i++) {
			array1[i] = in.nextInt();
		}

		int array2Count = in.nextInt();
		int[] array2 = new int[array2Count];
		for (int i = 0; i < array2Count; i++) {
			array2[i] = in.nextInt();
		}

		System.out.println(solution(array1, array2));
	}

	private static String solution(int[] array1, int[] array2) {
		// int[] sortedArray1 = getSortedArray(array1);
		// int[] sortedArray2 = getSortedArray(array2);
		Arrays.sort(array1);
		Arrays.sort(array2);

		List<Integer> result = new ArrayList<>();

		int p1 = 0, p2 = 0;
		while (p1 < array1.length && p2 < array2.length) {
			if (array1[p1] == array2[p2]) {
				result.add(array1[p1]);
				p1++;
				p2++;
			} else if (array1[p1] > array2[p2]) {
				p2++;
			} else {
				p1++;
			}
		}

		return result.stream().map(t -> t + " ").reduce("", String::concat);
	}

	private static int[] getSortedArray(int[] array) {
		int	minValue = array[0];
		int prevValue = 0;
		int[] sortedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (minValue > array[j] && array[j] > prevValue) {
					minValue = array[j];
				}
			}
			sortedArray[i] = minValue;
			prevValue = minValue;
			minValue = Integer.MAX_VALUE;
		}

		return sortedArray;
	}
}

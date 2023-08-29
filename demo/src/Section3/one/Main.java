package Section3.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 28.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array1Count = in.nextInt();
		int[] arr1 = new int[array1Count];
		for (int i = 0; i < array1Count; i++) {
			arr1[i] = in.nextInt();
		}

		int array2Count = in.nextInt();
		int[] arr2 = new int[array2Count];
		for (int i = 0; i < array2Count; i++) {
			arr2[i] = in.nextInt();
		}

		System.out.println(solution(arr1, arr2));
	}

	private static String solution(int[] arr1, int[] arr2) {
		List<Integer> result = new ArrayList<>();

		int p1 = 0, p2 = 0;
		while (p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] > arr2[p2]) {
				result.add(arr2[p2++]);
			} else {
				result.add(arr1[p1++]);
			}
		}

		while (p1 < arr1.length) {
			result.add(arr1[p1++]);
		}

		while (p2 < arr2.length) {
			result.add(arr2[p2++]);
		}

		return result.stream().map(t -> t + " ").reduce("", String::concat);
	}

	// private static String solution(int[] arr1, int[] arr2) {
	// 	int[] array = Stream.of(arr1, arr2).flatMapToInt(IntStream::of).sorted().toArray();
	// 	return Arrays.stream(array).mapToObj(i -> i + " ").reduce("", String::concat);
	// }
}

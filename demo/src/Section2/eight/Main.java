package Section2.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 27.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(solution(arr));
	}

	private static String solution(int[] arr) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}
			result += count + " ";
		}
		return result;
	}

	// private static String solution(int[] arr) {
	// 	HashMap<Integer, Integer> rankMap = new HashMap<>();
	// 	int max = 0;
	// 	int rank = 1;
	// 	String result = "";
	//
	// 	int[] array = Arrays.stream(arr)
	// 		.boxed()
	// 		.sorted(Collections.reverseOrder())
	// 		.mapToInt(Integer::intValue).toArray();
	//
	// 	for (int i = 0; i < array.length; i++) {
	// 		if (i == 0) {
	// 			max = array[i];
	// 		}
	//
	// 		if (max == array[i]) {
	// 			rankMap.put(array[i], rank);
	// 		} else {
	// 			max = array[i];
	// 			rankMap.put(array[i], i + 1);
	// 			rank = i + 1;
	// 		}
	// 	}
	//
	// 	String reduce = Arrays.stream(arr).mapToObj(num -> rankMap.get(num) + " ").reduce("", String::concat);
	//
	// 	return reduce;
	// }
}

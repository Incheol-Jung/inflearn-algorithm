package Section6.five;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
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

	// private static String solution(int[] arr) {
	// 	Arrays.sort(arr);
	// 	for (int i = 0; i < arr.length - 1; i++) {
	// 		if (arr[i] == arr[i + 1]) {
	// 			return "D";
	// 		}
	// 	}
	// 	return "U";
	// }

	private static String solution(int[] arr) {
		boolean isDuplicate = false;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int x : arr) {
			Integer i = hashMap.getOrDefault(x, 0);
			if (i == 0) {
				hashMap.put(x, hashMap.getOrDefault(x, 1));
			} else {
				isDuplicate = true;
				break;
			}
		}
		return isDuplicate ? "D" : "U";
	}

	// private static String solution(int[] arr) {
	// 	boolean isDuplicate = false;
	//
	// 	for (int i = 0; i < arr.length && isDuplicate == false; i++) {
	// 		for (int j = i + 1; j < arr.length; j++) {
	// 			if (arr[i] == arr[j]) {
	// 				isDuplicate = true;
	// 				break;
	// 			}
	// 		}
	// 	}
	//
	// 	return isDuplicate ? "D" : "U";
	// }
}

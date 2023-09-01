package Section8.four;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	private static int TEMP_COUNT = Integer.MAX_VALUE;
	private static int PRICE = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Integer[] arr = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		PRICE = in.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(solution(arr));
	}

	private static int solution(Integer[] arr) {
		calculate(0, 0, arr);
		return TEMP_COUNT;
	}

	private static void calculate(int count, int sum, Integer[] arr) {
		if (sum > PRICE || TEMP_COUNT < count) {
			return;
		}

		if (sum == PRICE) {
			if (TEMP_COUNT > count) {
				TEMP_COUNT = count;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				calculate(count + 1, sum + arr[i], arr);
			}
		}
	}
}

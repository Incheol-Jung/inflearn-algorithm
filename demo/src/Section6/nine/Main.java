package Section6.nine;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int capacity = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, capacity));
	}

	private static int solution(int[] arr, int capacity) {
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int result = -1;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (getCapacity(arr, mid) <= capacity) {
				result = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

		return result;
	}

	private static int getCapacity(int[] arr, int max) {
		int count = 1;
		int sum = 0;

		for (int num : arr) {
			if ((sum + num) > max) {
				count++;
				sum = num;
			} else {
				sum += num;
			}
		}

		return count;
	}
}

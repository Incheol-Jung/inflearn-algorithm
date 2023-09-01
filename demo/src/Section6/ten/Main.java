package Section6.ten;

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
		int distance = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, distance));
	}

	private static int solution(int[] arr, int distance) {
		Arrays.sort(arr);
		int lt = 1, rt = arr[arr.length - 1];
		int answer = -1;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (temp(arr, mid) >= distance) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer;
	}

	private static int temp(int[] arr, int distance) {
		int count = 1;
		int idx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[idx] >= distance) {
				count++;
				idx = i;
			}
		}
		return count;
	}
}

package Section6.eight;

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
		int target = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(solution(arr, target));
	}

	private static int solution(int[] arr, int target) {
		int rt = arr.length - 1, lt = 0;
		int answer = -1;
		while (lt <= rt) {
			int mid = (rt + lt) / 2;

			if (target == arr[mid]) {
				answer = mid;
				break;
			}

			if (target > arr[mid]) {
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer + 1;
	}
}

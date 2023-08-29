package Section3.four;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 29.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int sum = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, count, sum));
	}

	private static int solution(int[] arr, int count, int sum) {
		int result = 0;
		int temp = 0;
		int removedIndex = 0;

		for (int i = 0; i < count; i++) {
			temp += arr[i];

			if (temp == sum) {
				result++;
			}
			while (temp >= sum) {
				temp -= arr[removedIndex++];
				if (temp == sum) {
					result++;
				}
			}
		}

		return result;
	}
}

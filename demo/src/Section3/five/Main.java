package Section3.five;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 29.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		System.out.println(solution(num));
	}

	private static int solution(int num) {
		int result = 0;
		int tempSum = 0;
		int lt = 0;
		int[] arr = new int[num];

		int rt = num / 2 + 1;
		for (int i = 0; i < rt; i++) {
			arr[i] = i+1;
		}

		for (int i = 0; i < rt; i++) {
			tempSum += arr[i];
			if (tempSum == num) {
				result++;
			}

			while (tempSum >= num) {
				tempSum -= arr[lt++];
				if (tempSum == num) {
					result++;
				}
			}
		}
		return result;
	}
}

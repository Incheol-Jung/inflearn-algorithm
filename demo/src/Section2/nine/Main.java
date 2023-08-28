package Section2.nine;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 28.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[][] arr = new int[count][count];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(solution(count, arr));
	}

	private static int solution(int count, int[][] arr) {
		int MAX_VALUE = Integer.MIN_VALUE;

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < count; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < count; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			MAX_VALUE = Math.max(MAX_VALUE, sum1);
			MAX_VALUE = Math.max(MAX_VALUE, sum2);
		}

		sum1 = sum2 = 0;
		for (int i = 0; i < count; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][(count - i) - 1];
		}

		MAX_VALUE = Math.max(MAX_VALUE, sum1);
		MAX_VALUE = Math.max(MAX_VALUE, sum2);

		return MAX_VALUE;
	}
}

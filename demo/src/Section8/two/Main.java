package Section8.two;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	private static int MAXIMUM = 0;
	private static int SIZE = 0;
	private static int TEMP = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MAXIMUM = in.nextInt();
		SIZE = in.nextInt();
		int[] arr = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		calculate(0, 0, arr);
		return TEMP;
	}

	private static void calculate(int index, int sum, int[] arr) {
		if (sum > MAXIMUM) {
			return;
		}

		if (index == SIZE) {
			if (TEMP < sum) {
				TEMP = sum;
			}
		} else {
			calculate(index + 1, sum + arr[index], arr);
			calculate(index + 1, sum, arr);
		}
	}
}

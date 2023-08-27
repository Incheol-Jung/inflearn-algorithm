package Section2.eight;

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

	private static int solution(int[] arr) {
		int sum = 0;
		int score = 0;
		for (int j : arr) {
			if (j == 1) {
				score++;
				sum += score;
			} else {
				score = 0;
			}
		}
		return sum;
	}
}

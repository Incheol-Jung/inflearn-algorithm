package Section8.three;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	private static int SIZE = 0;
	private static int MAXIMUM_TIME = 0;
	private static int TEMP_SCORE = Integer.MIN_VALUE;

	public static class Problem {
		private int time;
		private int score;

		public Problem(int score, int time) {
			this.score = score;
			this.time = time;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SIZE = in.nextInt();
		MAXIMUM_TIME = in.nextInt();
		Problem[] arr = new Problem[SIZE];
		for (int i = 0; i < SIZE; i++) {
			arr[i] = new Problem(in.nextInt(), in.nextInt());
		}

		System.out.println(solution(arr));
	}

	private static int solution(Problem[] arr) {
		calculate(0, 0, 0, arr);
		return TEMP_SCORE;
	}

	private static void calculate(int index, int sum, int totalScore, Problem[] arr) {
		if (sum > MAXIMUM_TIME) {
			return;
		}

		if (index == SIZE) {
			if (TEMP_SCORE < totalScore) {
				TEMP_SCORE = totalScore;
			}
		} else {
			calculate(index + 1, sum + arr[index].time, totalScore + arr[index].score, arr);
			calculate(index + 1, sum, totalScore, arr);
		}
	}
}

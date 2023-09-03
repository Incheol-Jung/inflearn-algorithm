package Section8.eleven;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 02.
 */
public class Main {

	public static class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static Point[] moves = new Point[] {new Point(-1, 0), new Point(0, -1), new Point(0, 1), new Point(1, 0)};
	private static int MIN_DISTANCE = -1;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = 7;
		int[][] arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(solution(arr));
	}

	private static int solution(int[][] arr) {
		calculate(arr, 0, 0, 0);
		return MIN_DISTANCE;
	}

	private static void calculate(int[][] arr, int x, int y, int count) {
		if (x > 6 || y > 6 || x < 0 || y < 0 || (MIN_DISTANCE != -1 && MIN_DISTANCE < count)) {
			return;
		}

		if (arr[x][y] == 1) {
			return;
		}

		if (x == 6 && y == 6) {
			if (MIN_DISTANCE == -1 || MIN_DISTANCE > count) {
				MIN_DISTANCE = count;
			}
		} else {
			for (Point move : moves) {
				arr[x][y] = 1;
				calculate(arr, x + move.x, y + move.y, count + 1);
				arr[x][y] = 0;
			}
		}
	}
}

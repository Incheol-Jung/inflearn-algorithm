package Section8.ten;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 02.
 */
public class Main {
	private static int COUNT = 0;

	public static class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static Point[] moves = new Point[] {new Point(-1, 0), new Point(0, -1), new Point(0, 1), new Point(1, 0)};

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
		calculate(arr, 0, 0);
		return COUNT;
	}

	private static void calculate(int[][] arr, int x, int y) {
		if (x > 6 || y > 6 || x < 0 || y < 0) {
			return;
		}

		if (arr[x][y] == 1) {
			return;
		}

		if (x == 6 && y == 6) {
			COUNT++;
		} else {
			for (Point move : moves) {
				arr[x][y]=1;
				calculate(arr, x + move.x, y + move.y);
				arr[x][y]=0;
			}
		}
	}
}
package Section8.fourteen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 03.
 */
public class Main {

	private static class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static Point[] moves = new Point[] {
		new Point(-1, -1),
		new Point(-1, 0),
		new Point(-1, 1),
		new Point(0, -1),
		new Point(0, 1),
		new Point(1, -1),
		new Point(1, 0),
		new Point(1, 1)
	};

	private static int SIZE = 0;
	private static int COUNT = 0;
	private static Queue<Point> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SIZE = in.nextInt();
		int[][] arr = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (arr[i][j] == 1) {
					COUNT++;
					arr[i][j] = 0;

					calculate(arr, i, j);
				}
			}
		}
		System.out.println(COUNT);
	}

	private static void calculate(int[][] arr, int x, int y) {
		queue.offer(new Point(x, y));
		if (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (Point move : moves) {
				int x1 = temp.x + move.x;
				int y1 = temp.y + move.y;

				if (x1 >= 0 && x1 < SIZE && y1 >= 0 && y1 < SIZE) {
					if (arr[x1][y1] == 1) {
						arr[x1][y1] = 0;
						calculate(arr, x1, y1);
					}
				}
			}
		}
	}
}

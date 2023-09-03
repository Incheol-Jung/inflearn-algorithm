package Section8.tweleve;

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

	private static Queue<Point> queue = new LinkedList<>();
	private static Point[] moves = new Point[] {new Point(-1, 0), new Point(0, -1), new Point(0, 1), new Point(1, 0)};
	private static int COLUMN = 0;
	private static int ROW = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		COLUMN = in.nextInt();
		ROW = in.nextInt();
		int[][] arr = new int[ROW][COLUMN];
		int[][] dis = new int[ROW][COLUMN];

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				arr[i][j] = in.nextInt();
				if (arr[i][j] == 1) {
					queue.offer(new Point(i, j));
				}
			}
		}

		calculate(arr, dis);
		boolean isNotCompleted = true;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				if (arr[i][j] == 0) {
					isNotCompleted = false;
				}
			}
		}

		if(isNotCompleted){
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < ROW; i++) {
				for (int j = 0; j < COLUMN; j++) {
					if (max < dis[i][j]) {
						max = dis[i][j];
					}
				}
			}
			System.out.println(max);
		} else {
			System.out.println(-1);
		}
	}

	private static void calculate(int[][] arr, int[][] dis) {
		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (int i = 0; i < moves.length; i++) {
				int x1 = temp.x + moves[i].x;
				int y1 = temp.y + moves[i].y;
				if (x1 >= 0 && x1 < ROW && y1 >= 0 && y1 < COLUMN && arr[x1][y1] == 0) {
					arr[x1][y1] = 1;
					queue.offer(new Point(x1, y1));
					dis[x1][y1] = dis[temp.x][temp.y] + 1;
				}
			}
		}
	}
}

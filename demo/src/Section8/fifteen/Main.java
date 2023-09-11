package Section8.fifteen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 07.
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
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int minCount = in.nextInt();
		int[][] arr = new int[size][size];
		Queue<Point> houses = new LinkedList<>();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (in.nextInt() == 1) {
					houses.offer(new Point(i, j));
				} else if (in.nextInt() == 2) {

				}
			}
		}

		System.out.println(solution(arr, minCount));
	}

	private static int solution(int[][] arr, int minCount) {

		return 0;
	}
}

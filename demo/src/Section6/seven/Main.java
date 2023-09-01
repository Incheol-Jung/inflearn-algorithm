package Section6.seven;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
 */
public class Main {
	static class Point implements Comparable<Point> {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x == o.x) return this.y - o.y;
			else return this.x - o.x;
		}

		// public boolean isBigger(Point point) {
		// 	if (this.x > point.x) {
		// 		return true;
		// 	} else if (this.x == point.x) {
		// 		if (this.y > point.y) {
		// 			return true;
		// 		}
		// 		return false;
		//
		// 	} else {
		// 		return false;
		// 	}
		// }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		Point[] arr = new Point[count];

		for (int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			arr[i] = new Point(x, y);
		}

		Arrays.sort(arr);

		for (Point point : arr) {
			System.out.println(point.x + " " + point.y);
		}
	}

	// private static Point[] solution(Point[] arr) {
	// 	for (int i = 0; i < arr.length; i++) {
	// 		int minIndex = i;
	// 		for (int j = i + 1; j < arr.length; j++) {
	// 			if (arr[minIndex].isBigger(arr[j])) {
	// 				minIndex = j;
	// 			}
	// 		}
	// 		Point temp = arr[i];
	// 		arr[i] = arr[minIndex];
	// 		arr[minIndex] = temp;
	// 	}
	// 	return arr;
	// }
}

// package Section8.tweleve;
//
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;
//
// /**
//  *
//  * @author Incheol.Jung
//  * @since 2023. 09. 02.
//  */
// public class Main {
// 	public static class Point {
// 		private int x;
// 		private int y;
//
// 		public Point(int x, int y) {
// 			this.x = x;
// 			this.y = y;
// 		}
// 	}
//
// 	private static Point[] moves = new Point[] {new Point(-1, 0), new Point(0, -1), new Point(0, 1), new Point(1, 0)};
//
// 	private static int COLUMN = 0;
// 	private static int ROW = 0;
// 	private static int COUNT = 0;
//
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		COLUMN = in.nextInt();
// 		ROW = in.nextInt();
// 		int[][] arr = new int[ROW][COLUMN];
//
// 		for (int i = 0; i < ROW; i++) {
// 			for (int j = 0; j < COLUMN; j++) {
// 				arr[i][j] = in.nextInt();
// 			}
// 		}
//
// 		System.out.println(solution(arr));
// 	}
//
// 	private static int solution(int[][] arr) {
// 		calculate(arr, 0, 0);
// 		return COUNT;
// 	}
//
// 	private static void calculate(int[][] arr, int x, int y) {
// 		Queue<Point> queue = new LinkedList<>();
// 		queue.offer(new Point(x, y));
// 		while (!queue.isEmpty()) {
// 			Point point = queue.poll();
// 			boolean isUpdate = false;
// 			for (int i = 0; i < moves.length; i++) {
// 				int x1 = moves[i].x + point.x;
// 				int y1 = moves[i].y + point.y;
//
// 				if (0 <= x1 && x1 < ROW && 0 <= y1 && y1 < COLUMN && arr[x1][y1] == 0) {
// 					queue.offer(new Point(x1, y1));
// 					if (arr[point.x][point.y] == 1) {
// 						if (arr[x1][y1] == -1 || arr[x1][y1] == 0) {
// 							arr[x1][y1] = 1;
// 							isUpdate = true;
// 						}
// 					}
// 				}
// 			}
// 			if (isUpdate == true) {
// 				COUNT++;
// 				isUpdate = false;
// 			}
//
// 		}
// 	}
// }

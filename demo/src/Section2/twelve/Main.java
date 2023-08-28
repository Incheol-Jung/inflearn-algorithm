package Section2.twelve;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 28.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int column = in.nextInt();
		int row = in.nextInt();
		int[][] arr = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(solution(arr, row, column));
	}

	private static int solution(int[][] arr, int row, int column) {
		boolean isMatch = false;
		int count = 0;

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < column; j++) {
				if (arr[0][i] < arr[0][j]) {
					isMatch = true;
					for (int l = 1; l < row; l++) {
						if (arr[l][i] > arr[l][j]) {
							isMatch = false;
							break;
						}
					}
				}

				if (isMatch == true) {
					count++;
					isMatch = false;
				}
			}
		}
		return count;
	}
}

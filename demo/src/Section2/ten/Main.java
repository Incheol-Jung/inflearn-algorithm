package Section2.ten;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 28.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();

		int[][] arr = new int[count][count];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(solution(count, arr));
	}

	private static int solution(int count, int[][] arr) {
		int totalCount = 0;

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (isMountain(arr, i, j, count)) {
					totalCount++;
				}
			}
		}

		return totalCount;
	}

	private static boolean isMountain(int[][] arr, int i, int j, int count) {
		int height = arr[i][j];
		if (i > 0) {
			if (height <= arr[i - 1][j]) {
				return false;
			}
		}

		if (j > 0) {
			if (height <= arr[i][j - 1]) {
				return false;
			}
		}

		if (i < (count-1)) {
			if (height <= arr[i+1][j]){
				return false;
			}
		}

		if (j < (count-1)) {
			if (height <= arr[i][j+1]){
				return false;
			}
		}

		return true;
	}
}

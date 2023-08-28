package Section2.eleven;

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
		int[][] arr = new int[count][5];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(solution(arr, count));
	}

	private static int solution(int[][] arr, int count) {
		int user = 0, maxCount = Integer.MIN_VALUE;
		int tempCount;

		for (int i = 0; i < count; i++) {
			tempCount = 0;
			for (int j = 0; j < count; j++) {
				for (int k = 0; k < 5; k++) {
					if (i != j && arr[i][k] == arr[j][k]) {
						tempCount++;
						break;
					}
				}
			}
			if (tempCount > maxCount) {
				user = i;
				maxCount = tempCount;
			}
		}

		return (user + 1);
	}
}

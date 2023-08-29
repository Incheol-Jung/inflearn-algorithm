package Section3.three;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 29.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int period = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, count, period));
	}

	private static int solution(int[] arr, int count, int period) {
		int[] tempArr = new int[count];
		int maxValue = Integer.MIN_VALUE;
		int tempSum = 0;

		for (int i = 0; i < count; i++) {
			tempSum += arr[i];
			if(i-period >= 0){
				tempSum -= arr[i-period];
			}

			if(maxValue < tempSum) {
				maxValue = tempSum;
			}
		}

		// for (int i = 0; i < tempArr.length; i++) {
		// 	if (maxValue < tempArr[i]) {
		// 		maxValue = tempArr[i];
		// 	}
		// }

		// [0] -> 0,1,2
		// [1] -> 1,2,3
		// [2] -> 2,3,4
		// [3] -> 3,4,5

		return maxValue;
	}
}

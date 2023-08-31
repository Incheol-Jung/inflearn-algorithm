package Section6.three;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		for (int i : solution(arr)) {
			System.out.print(i + " ");
		}
	}

	private static int[] solution(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i], j;
			for (j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}

			arr[j + 1] = temp;
		}
		return arr;
	}
}

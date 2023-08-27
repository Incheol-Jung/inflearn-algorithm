package Section2.one;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 27.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr));
	}

	private static String solution(int[] arr) {
		String result = ""+arr[0] + " ";
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] < arr[i]) {
				result += arr[i] + " ";
			}
		}
		return result;
	}
}

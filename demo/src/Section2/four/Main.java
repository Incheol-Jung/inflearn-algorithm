package Section2.four;

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
		System.out.println(solution(count));
	}

	private static String solution(int count) {
		String result = "";

		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			if (i == 0 || i == 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-2] + arr[i-1];
			}
			result += arr[i] + " ";
		}
		return result;
	}
}

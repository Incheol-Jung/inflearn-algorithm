package Section2.three;

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
		int[] arr1 = new int[count];
		int[] arr2 = new int[count];
		for (int i = 0; i < count; i++) {
			arr1[i] = in.nextInt();
		}
		for (int i = 0; i < count; i++) {
			arr2[i] = in.nextInt();
		}
		System.out.println(solution(arr1, arr2));
	}

	private static String solution(int[] arr1, int[] arr2) {
		String result = "";

		for (int i = 0; i < arr1.length; i++) {
			int res = arr1[i] - arr2[i];
			if (res == 1 || res == -2) {
				result += "A" + "\n";
			} else if (res == 0) {
				result += "D" + "\n";
			} else {
				result += "B" + "\n";
			}
		}

		return result;
	}
}

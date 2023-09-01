package Section8.one;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	private static int answer = 0;
	private static int total = 0;
	private static int size = 1;
	private static String result = "NO";
	private static boolean isDone = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			total += arr[i];
		}
		System.out.println(solution(arr));
	}

	private static String solution(int[] arr) {
		answer = (Arrays.stream(arr).sum() / 2);
		calculate(0, 0, arr);
		return result;
	}

	private static void calculate(int index, int sum, int[] arr) {
		if (answer < sum || isDone == true) {
			return;
		}

		if (index == size) {
			if ((total - sum) == sum) {
				result = "YES";
				isDone = true;
			}
		} else {
			calculate(index + 1, sum + arr[index], arr);
			calculate(index + 1, sum, arr);
		}

	}
}

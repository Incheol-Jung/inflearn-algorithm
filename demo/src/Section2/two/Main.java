package Section2.two;

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

	private static int solution(int[] arr) {
		int count = 1;
		int min = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (min < arr[i + 1]) {
				count++;
				min = arr[i + 1];
			}
		}
		return count;
	}
}

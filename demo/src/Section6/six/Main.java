package Section6.six;

import java.util.Arrays;
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

		for (int x : solution(arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int[] arr) {
		int[] result = new int[2];
		int index = 0;
		int[] temp = arr.clone();
		Arrays.sort(temp);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp[i]) {
				result[index] = i + 1;
				index++;
			}
		}
		return result;
	}
}

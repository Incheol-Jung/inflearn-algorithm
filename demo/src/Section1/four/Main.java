package Section1.four;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 24.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();

		String[] arr = new String[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.next();
		}

		System.out.println(solution(arr));
	}

	private static String solution(String[] arr) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			// result.append(new StringBuilder(arr[i]).reverse().append("\n"));
			result.append(reverse(arr[i]));
		}
		return result.toString();
	}

	private static String reverse(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		char[] charArray = str.toCharArray();
		// for (int i = str.length() - 1; i >= 0; i--) {
		// 	stringBuilder.append(str.toCharArray()[i]);
		// }
		// return stringBuilder.append("\n").toString();
		int lt = 0, rt = str.length()-1;
		while (lt < rt) {
			char temp = charArray[lt];
			charArray[lt] = charArray[rt];
			charArray[rt] = temp;
			lt++;
			rt--;
		}
		return String.valueOf(charArray);
	}
}

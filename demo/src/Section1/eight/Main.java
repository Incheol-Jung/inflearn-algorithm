package Section1.eight;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 24.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String convertedStr = str.toLowerCase().replaceAll("[^a-z]", "");
		char[] charArray = convertedStr.toCharArray();
		int lt = 0, rt = convertedStr.length() - 1;

		while (lt < rt) {
			if (charArray[lt] != charArray[rt]) {
				return "NO";
			}
			lt++;
			rt--;
		}

		return "YES";
	}
}

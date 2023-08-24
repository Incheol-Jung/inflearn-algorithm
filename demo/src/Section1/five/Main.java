package Section1.five;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 24.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		char[] charArray = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(charArray[lt])) {
				lt++;
			}

			if (!Character.isAlphabetic(charArray[rt])) {
				rt--;
			}

			if (Character.isAlphabetic(charArray[lt]) && Character.isAlphabetic(charArray[rt])) {
				char temp = charArray[lt];
				charArray[lt] = charArray[rt];
				charArray[rt] = temp;
				lt++;
				rt--;
			}
		}

		return String.valueOf(charArray);
	}
}

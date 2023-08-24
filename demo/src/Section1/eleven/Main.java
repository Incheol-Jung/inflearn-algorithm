package Section1.eleven;

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
		int count = 1;
		str = str + " ";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				result.append(str.charAt(i));
				if (count > 1) {
					result.append(count);
				}
				count = 1;
			}
		}
		return result.toString();
	}

	// private static String solution(String str) {
	// 	StringBuilder stringBuilder = new StringBuilder();
	// 	int count = 1;
	// 	Character lastChar = null;
	//
	// 	for (int i = 0; i < str.length(); i++) {
	// 		char ch = str.charAt(i);
	// 		if (lastChar == null) {
	// 			lastChar = ch;
	// 			stringBuilder.append(ch);
	// 		} else {
	// 			if (ch == lastChar) {
	// 				count++;
	// 			} else {
	// 				stringBuilder.append(count == 1 ? "" : count);
	// 				count = 1;
	// 				lastChar = ch;
	// 				stringBuilder.append(lastChar);
	// 			}
	//
	// 			if (i == (str.length() - 1)) {
	// 				stringBuilder.append(count == 1 ? "" : count);
	// 			}
	// 		}
	// 	}
	// 	return stringBuilder.toString();
	// }
}

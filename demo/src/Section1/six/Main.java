package Section1.six;

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
		String result = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == index) {
				result += str.charAt(index);
			}
		}
		return result;
	}

	// private static String solution(String str) {
	// 	char[] charArray = new char[str.length()];
	// 	int index = 0;
	// 	for (char c : str.toCharArray()) {
	// 		boolean isExist = false;
	// 		for (char temp : charArray) {
	// 			if (temp == c) {
	// 				isExist = true;
	// 				break;
	// 			}
	// 		}
	// 		if (isExist == false) {
	// 			charArray[index] = c;
	// 			index++;
	// 		}
	// 	}
	// 	return String.valueOf(charArray).replace("\u0000","");
	// }
}

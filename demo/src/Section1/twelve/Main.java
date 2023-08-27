package Section1.twelve;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 27.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String encryptContent = in.next();
		System.out.println(solution(number, encryptContent));
	}

	private static String solution(int number, String encryptContent) {
		String result = "";

		for (int i = 0; i < number; i++) {
			String substring = encryptContent.substring(0, 7).replace("*","0").replace("#","1");
			int num = Integer.parseInt(substring, 2);
			result += (char) num;
			encryptContent = encryptContent.substring(7);
		}

		return result;
	}

	// private static String solution(String encryptContent) {
	// 	int count = 1;
	// 	StringBuilder binaryWord = new StringBuilder();
	// 	StringBuilder result = new StringBuilder();
	//
	// 	for (char ch : encryptContent.toCharArray()) {
	// 		String number = decryptWords(ch);
	// 		binaryWord.append(number);
	//
	// 		if (count != 0 && count % 7 == 0) {
	// 			int tenNumber = Integer.parseInt(binaryWord.toString(), 2);
	// 			binaryWord = new StringBuilder();
	//
	// 			char temp = (char)tenNumber;
	// 			result.append(temp);
	// 		}
	//
	// 		count++;
	// 	}
	//
	// 	return result.toString();
	// }
	//
	// private static String decryptWords(char ch) {
	// 	if (ch == '*') {
	// 		return "0";
	// 	} else if (ch == '#') {
	// 		return "1";
	// 	}
	// 	return null;
	// }
}

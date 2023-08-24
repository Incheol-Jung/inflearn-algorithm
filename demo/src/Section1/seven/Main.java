package Section1.seven;

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
		String result = "YES";
		char[] charArray = str.toLowerCase().toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (charArray[lt] != charArray[rt]) {
				return "NO";
			}
			lt++;
			rt--;
		}
		return result;
	}
}

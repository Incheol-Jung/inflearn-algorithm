package Section1.Two;

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
		StringBuffer stringBuffer = new StringBuffer();
		for (char temp : str.toCharArray()) {
			char c = Character.isLowerCase(temp) ? Character.toUpperCase(temp) : Character.toLowerCase(temp);
			stringBuffer.append(c);
		}

		return stringBuffer.toString();
	}
}

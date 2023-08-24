package Section1.nine;

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

	private static int solution(String str) {
		String s = str.replaceAll("[^0-9]", "");
		return Integer.parseInt(s);
	}
}

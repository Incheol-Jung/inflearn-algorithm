package Section1.three;

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
		// String[] splitStr = str.split("\\s+");
		// Optional<String> max = Arrays.stream(splitStr).max(Comparator.comparing(String::length));
		// return max.orElse("");

		String result = "";
		int temp_length = 0;

		String[] splitStr = str.split("\\s+");
		for (String temp : splitStr) {
			if(temp_length < temp.length()) {
				temp_length = temp.length();
				result = temp;
			}
		}

		return result;
	}
}

package Section1.one;

import java.util.Scanner;

class Main {

	public static int solution(String str, char c) {
		int count = 0;
		char lowerCase = Character.toLowerCase(c);

		if (str == null || str.length() == 0) {
			return count;
		}

		for (char temp : str.toLowerCase().toCharArray()) {
			if (temp == lowerCase) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char c = in.next().charAt(0);

		System.out.println(solution(str, c));
	}
}
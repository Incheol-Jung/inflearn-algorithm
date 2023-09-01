package Section8.seven;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();

		System.out.println(solution(n, r));
	}

	private static int solution(int n, int r) {
		int answer = calculate(n, r);
		return answer;
	}

	private static int calculate(int n, int r) {
		if (n <= 0 || r <= 0 || n == r) {
			return 1;
		}
		return calculate(n - 1, r - 1) + calculate(n - 1, r);
	}
}

package Section2.five;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 27.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		System.out.println(solution(count));
	}

	private static int solution(int count) {
		int result = 0;
		for (int i = 1; i <= count; i++) {
			if (isPrime(i)) {
				result++;
			}
		}
		return result;
	}

	private static boolean isPrime(int n) {
		if(n==1) return false;

		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n == 1 || n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

package Section2.six;

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
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(solution(arr));
	}

	private static String solution(int[] arr) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			int temp = changeNum(arr[i]);
			if (isPrime(temp)) {
				result += temp + " ";
			}
		}
		return result;
	}

	private static int changeNum(int number) {
		String s = String.valueOf(number);
		String temp = new StringBuilder(s).reverse().toString();

		return Integer.parseInt(temp);
	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;

		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n == 1 || n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

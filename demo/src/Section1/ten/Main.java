package Section1.ten;

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
		char criteria = in.next().charAt(0);
		System.out.println(solution(str, criteria));
	}

	private static String solution(String str, char criteria) {
		StringBuilder result = new StringBuilder();
		for (int index = 0; index < str.length(); index++) {
			result.append(calculate(str, index, str.charAt(index), criteria));
		}

		return result.toString();
	}

	private static String calculate(String str, int currentIndex, char c, char criteria) {
		int minDistance = currentIndex;
		int nextIndex = 0;

		int criteriaIndex = str.indexOf(criteria);
		if (criteriaIndex == -1) {
			return currentIndex + " ";
		}

		if (criteriaIndex != -1) {
			int absDistance = Math.abs(currentIndex - criteriaIndex);
			minDistance = absDistance;
			nextIndex = criteriaIndex++;
		}

		if (c == criteria) {
			return 0 + " ";
		}


		while (true) {
			criteriaIndex = str.indexOf(criteria, nextIndex);
			if (criteriaIndex == -1) {
				break;
			}

			int absDistance = Math.abs(currentIndex - criteriaIndex);
			if (absDistance < minDistance) {
				minDistance = absDistance;
			}
			nextIndex = criteriaIndex + 1;

		}

		return minDistance + " ";
	}
}

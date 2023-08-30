package Section4.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		String votes = in.next();

		System.out.println(solution(count, votes));
	}

	private static String solution(int count, String votes) {
		int max = Integer.MIN_VALUE;
		String result = "";
		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (char c : votes.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entries : hashMap.entrySet()) {
			if (max < entries.getValue()) {
				max = entries.getValue();
				result = String.valueOf(entries.getKey());
			}
		}

		return result;
	}
}

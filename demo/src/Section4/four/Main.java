package Section4.four;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fullContent = in.next();
		String partialContent = in.next();

		System.out.println(solution(fullContent, partialContent));

	}

	private static int solution(String fullContent, String partialContent) {
		int count = 0;
		int maxCount = fullContent.length();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (char ch : partialContent.toCharArray()) {
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = partialContent.length() - 1; i < maxCount; i++) {
			String substring = fullContent.substring(0, partialContent.length());
			if (isAnagram(hashMap, substring)) {
				count++;
			}

			fullContent = fullContent.substring(1);
		}
		return count;
	}

	private static boolean isAnagram(HashMap<Character, Integer> hashMap, String substring) {
		HashMap<Character, Integer> tempHashMap = new HashMap<>(hashMap);

		for (char ch : substring.toCharArray()) {
			if (!tempHashMap.containsKey(ch) || tempHashMap.getOrDefault(ch, 0) == 0) {
				return false;
			}
			tempHashMap.put(ch, hashMap.get(ch) - 1);
		}

		return true;
	}
}

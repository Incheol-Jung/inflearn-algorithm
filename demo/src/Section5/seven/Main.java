package Section5.seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String partialContent = in.next();
		String content = in.next();

		System.out.println(solution(partialContent, content));
	}

	private static String solution(String partialContent, String content) {
		Queue<Character> queue = new LinkedList<>();

		for (char ch : partialContent.toCharArray()) {
			queue.offer(ch);
		}

		for (char ch : content.toCharArray()) {
			Character peek = queue.peek();
			if (ch == peek) {
				queue.poll();
			}

			if (queue.isEmpty()) {
				break;
			}
		}

		return queue.isEmpty() ? "YES" : "NO";
	}
}

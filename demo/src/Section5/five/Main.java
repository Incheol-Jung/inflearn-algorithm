package Section5.five;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String content = in.next();
		System.out.println(solution(content));
	}

	private static int solution(String content) {
		int result = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == '(') {
				stack.push('(');
			} else {
				stack.pop();
				if (content.charAt(i - 1) == ')') {
					result++;
				} else {
					result += stack.size();
				}
			}
		}

		return result;
	}
}

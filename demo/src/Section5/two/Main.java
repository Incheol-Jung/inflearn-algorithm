package Section5.two;

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

	private static String solution(String content) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (char ch : content.toCharArray()) {
			if (ch == ')') {
				if (!stack.isEmpty()) {
					Character pop = stack.pop();
					while (pop != '(') {
						pop = stack.pop();
					}
				}
			} else {
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.reverse().toString();
	}
}

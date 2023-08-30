package Section5.one;

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
		Stack<Character> stack = new Stack<>();
		for (char ch : content.toCharArray()) {
			if (stack.isEmpty()) {
				if(ch == ')'){
					return "NO";
				}
				stack.push(ch);
			} else {
				Character currentCh = stack.peek();
				if (ch == ')') {
					if (currentCh == '(') {
						stack.pop();
					} else {
						stack.push(ch);
					}
				}

				if (ch == '(') {
					if (currentCh == ')') {
						stack.pop();
					} else {
						stack.push(ch);
					}
				}
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}
}

package Section5.four;

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
		Stack<Integer> numbers = new Stack<>();

		for (char ch : content.toCharArray()) {
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				Integer nextNumber = numbers.pop();
				Integer prevNumber = numbers.pop();
				switch (ch) {
					case '+':
						numbers.push(prevNumber + nextNumber); break;
					case '-':
						numbers.push(prevNumber - nextNumber); break;
					case '*':
						numbers.push(prevNumber * nextNumber); break;
					case '/':
						numbers.push(prevNumber / nextNumber); break;
				}
			} else {
				numbers.add(Character.getNumericValue(ch));
			}
		}

		return numbers.pop();
	}
}

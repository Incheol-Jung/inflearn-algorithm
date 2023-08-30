package Section5.six;

import java.util.LinkedList;
import java.util.Queue;
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
		int count = in.nextInt();
		int k = in.nextInt();

		System.out.println(solution(count, k));
	}

	private static int solution(int count, int k) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			queue.offer(i+1);
		}

		Integer number = 1;
		while (queue.size() > 1) {
			int poll = queue.poll();
			if (!isOut(number, k)) {
				queue.offer(poll);
			} else {
				number = 0;
			}
			number++;
		}
		return queue.poll();
	}

	private static boolean isOut(Integer number, int k) {
		for (char ch : String.valueOf(number).toCharArray()) {
			if (Character.getNumericValue(ch) == k) {
				return true;
			}
		}
		return false;
	}
}

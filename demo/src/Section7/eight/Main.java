package Section7.eight;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 01.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int person = in.nextInt();
		int sheep = in.nextInt();
		System.out.println(solution(person, sheep));
	}

	private static int solution(int person, int sheep) {
		Queue<Integer> queue = new LinkedList<>();
		int[] jumps = new int[] {1, -1, 5};
		int[] positions = new int[10001];
		positions[person] = 1;
		queue.offer(person);

		int depth = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int position = queue.poll();
				for (int j = 0; j < jumps.length; j++) {
					int newPosition = position + jumps[j];
					if (newPosition == sheep) {
						return depth;
					}
					if (newPosition >= 1 && newPosition <= 10000 && positions[newPosition] == 0) {
						positions[newPosition] = 1;
						queue.offer(newPosition);
					}
				}
			}
			depth++;
		}

		return depth;
	}
}

package Section5.three;

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

		int[][] arr = new int[count][count];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int moveCount = in.nextInt();
		int[] moveArr = new int[moveCount];
		for (int i = 0; i < moveCount; i++) {
			moveArr[i] = in.nextInt();
		}

		System.out.println(solution(arr, moveArr));
	}

	private static int solution(int[][] arr, int[] moveArr) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moveArr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int currentItem = arr[j][moveArr[i] - 1];
				if (currentItem != 0) {
					if (!stack.isEmpty()) {
						Integer peek = stack.peek();
						if (peek.equals(currentItem)) {
							stack.pop();
							result += 2;
						} else {
							stack.add(currentItem);
						}
					} else {
						stack.add(currentItem);
					}
					arr[j][moveArr[i] - 1] = 0;
					break;
				}
			}
		}
		return result;
	}
}

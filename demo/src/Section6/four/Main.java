package Section6.four;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int count = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		for (int i : solution(arr, size)) {
			System.out.print(i + " ");
		}
	}

	private static int[] solution(int[] arr, int size) {
		int[] result = new int[size];

		for (int x : arr) {
			int pos = -1;
			for (int i = 0; i < result.length; i++) {
				if (result[i] == x) {
					pos = i;
					break;
				}
			}

			if (pos == -1) {
				for (int i = size - 1; i > 0; i--) {
					result[i] = result[i - 1];
				}
			} else {
				for (int i = pos; i > 0; i--) {
					result[i] = result[i - 1];
				}
			}
			result[0] = x;
		}

		return result;
	}

	// private static int[] solution(int[] arr, int size) {
	// 	Queue<Integer> queue = new LinkedList<>();
	// 	for (int i = 0; i < arr.length; i++) {
	// 		if (queue.isEmpty()) {
	// 			queue.offer(arr[i]);
	// 		} else {
	// 			boolean isExist = false;
	// 			for (Integer num : queue) {
	// 				if (num == arr[i]) {
	// 					isExist = true;
	// 					break;
	// 				}
	// 			}
	//
	// 			if (isExist == true) {
	// 				queue.remove(arr[i]);
	// 			}
	//
	// 			if (queue.size() == size) {
	// 				queue.poll();
	// 			}
	//
	// 			queue.offer(arr[i]);
	// 		}
	// 	}
	//
	// 	Stack<Integer> stack = new Stack<>();
	//
	// 	while (!queue.isEmpty()) {
	// 		Integer poll = queue.poll();
	// 		stack.push(poll);
	// 	}
	//
	// 	int[] arr2 = new int[size];
	// 	int index = 0;
	// 	while (!stack.isEmpty()) {
	// 		arr2[index] = stack.pop();
	// 		index++;
	// 	}
	//
	// 	return arr2;
	// }
}

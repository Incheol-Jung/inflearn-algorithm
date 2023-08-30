package Section5.eight;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
 */
public class Main {

	static class Person {
		private int index;
		private int priority;

		public Person(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int patient = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, patient));
	}

	private static int solution(int[] arr, int patient) {
		Queue<Person> queue = new LinkedList<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			queue.offer(new Person(i, arr[i]));
		}

		while (!queue.isEmpty()) {
			Person temp = queue.poll();
			for (Person p : queue) {
				if (p.priority > temp.priority) {
					queue.offer(temp);
					temp = null;
					break;
				}
			}

			if (temp != null) {
				if (temp.index == patient) {
					return count + 1;
				} else {
					count++;
				}
			}
		}

		return count;
	}
}

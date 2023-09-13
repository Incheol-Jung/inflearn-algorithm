package Section9.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 13.
 */
public class Main {
	private static class Lecture implements Comparable<Lecture> {
		private int price;
		private int days;

		public Lecture(int price, int days) {
			this.days = days;
			this.price = price;
		}

		@Override
		public int compareTo(Lecture o) {
			return o.days - this.days;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		List<Lecture> lectures = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int price = in.nextInt();
			int days = in.nextInt();
			lectures.add(new Lecture(price, days));
		}
		Collections.sort(lectures);
		System.out.println(solution(lectures));
	}

	private static int solution(List<Lecture> lectures) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		int result = 0;
		int j = 0;
		for (int i = lectures.get(0).days; i >= 1; i--) {
			for (; j < lectures.size(); j++) {
				if (lectures.get(j).days < i) {
					break;
				}

				priorityQueue.offer(lectures.get(j).price);
			}
			if (!priorityQueue.isEmpty()) {
				result += priorityQueue.poll();
			}
		}

		return result;
	}
}

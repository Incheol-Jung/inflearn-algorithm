package Section9.two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 11.
 */
public class Main {
	private static class Meeting implements Comparable<Meeting> {
		private int start;
		private int end;

		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			if (this.end == o.end) {
				return this.start - o.start;
			} else
				return this.end - o.end;
		}
	}

	private static int MAX_COUNT = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Meeting[] meetings = new Meeting[size];
		for (int i = 0; i < size; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			meetings[i] = new Meeting(start, end);
		}

		Arrays.sort(meetings);

		int solution = solution(meetings);

		System.out.println(solution);
	}

	private static int solution(Meeting[] meetings) {
		int result = 0;
		int currentEndTime = 0;

		for (Meeting meeting : meetings) {
			if (meeting.start >= currentEndTime) {
				currentEndTime = meeting.end;
				result++;
			}
		}

		return result;
	}
}

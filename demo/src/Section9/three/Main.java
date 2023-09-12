package Section9.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 12.
 */
public class Main {
	private static class Attendance implements Comparable<Attendance> {
		private int time;
		private String status;

		public Attendance(int time, String status) {
			this.time = time;
			this.status = status;
		}

		@Override
		public String toString() {
			return "Attendance{" +
				"time=" + time +
				", status='" + status + '\'' +
				'}';
		}

		@Override
		public int compareTo(Attendance o) {
			if (this.time == o.time) {
				if (this.status.equals("OUT")) {
					return -1;
				}
				return 1;
			} else {
				return this.time - o.time;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		List<Attendance> attendances = new ArrayList<>();
		for (int i = 0; i < (size * 2); i++) {
			int start = in.nextInt();
			String status = (i % 2) == 0 ? "GO" : "OUT";
			attendances.add(new Attendance(start, status));
		}

		Collections.sort(attendances);

		System.out.println(solution(attendances));
	}

	private static int solution(List<Attendance> attendances) {
		int maxCount = 0;
		int count = 0;

		for (Attendance attendance : attendances) {
			// System.out.println(attendance);
			if (attendance.status.equals("OUT")) {
				count--;
			}

			if (attendance.status.equals("GO")) {
				count++;
			}

			if (count > maxCount) {
				maxCount = count;
			}
		}

		return maxCount;
	}
}

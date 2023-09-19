package Section9.seven;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 14.
 */
public class Main {
	private static int[] unf;

	private static class Trip implements Comparable<Trip> {
		private int source;
		private int target;
		private int distance;

		public Trip(int source, int target, int distance) {
			this.source = source;
			this.target = target;
			this.distance = distance;
		}

		@Override
		public int compareTo(Trip o) {
			return this.distance - o.distance;
		}
	}

	private static int find(int source) {
		if (unf[source] == source)
			return source;
		else
			return unf[source] = find(unf[source]);
	}

	private static void union(int source, int target) {
		int desA = find(source);
		int desB = find(target);
		if (desA != desB) {
			unf[desA] = desB;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Trip[] trips = new Trip[m];
		unf = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			unf[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int source = in.nextInt();
			int target = in.nextInt();
			int distance = in.nextInt();

			trips[i] = new Trip(source, target, distance);
		}

		Arrays.sort(trips);

		System.out.println(solution(trips));
	}

	private static int solution(Trip[] trips) {
		int answer = 0;

		for (Trip trip : trips) {
			int desA = find(trip.source);
			int desB = find(trip.target);
			if (desA != desB) {
				answer += trip.distance;
				union(trip.source, trip.target);
			}
		}

		return answer;
	}
}

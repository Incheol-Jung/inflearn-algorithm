package Section4.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int period = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		// System.out.println(solution(arr, count, period));
		for(int x : solution(arr, count, period)) System.out.print(x+" ");
	}

	private static List<Integer> solution(int[] arr, int count, int period) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < period - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}


		int lt = 0;

		for (int rt = period - 1; rt < count; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			list.add(map.size());

			map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
			Integer value = map.get(arr[lt]);
			if (value <= 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}

		return list;
	}
}

package Section4.five;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int grade = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, grade));
	}

	private static int solution(int[] arr, int grade) {
		int result = -1;
		Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					treeSet.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}

		int count = 0;
		for (Integer x : treeSet) {
			count++;
			if (count == grade) {
				result = x;
				break;
			}
		}

		return result;
	}
}

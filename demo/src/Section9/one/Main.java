package Section9.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 11.
 */
public class Main {

	private static class Person implements Comparable<Person> {
		private int height;
		private int weight;

		public Person(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}

		public boolean isHigher(Person person) {
			return this.height < person.height && this.weight < person.weight;
		}

		@Override
		public String toString() {
			return "Person{" +
				"height=" + height +
				", weight=" + weight +
				'}';
		}

		@Override
		public int compareTo(Person person) {
			return person.height - this.height;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Person[] persons = new Person[size];
		for (int i = 0; i < size; i++) {
			int height = in.nextInt();
			int weight = in.nextInt();
			persons[i] = new Person(height, weight);
		}

		System.out.println(solution(persons));
	}

	private static int solution(Person[] persons) {
		int result = 0;

		Arrays.sort(persons);
		int max = Integer.MIN_VALUE;

		for (Person person : persons) {
			if (max < person.weight) {
				result++;
				max = person.weight;
			}
		}

		return result;
	}

	// private static int solution(Person[] persons) {
	// 	int result = 0;
	// 	List<Integer> removedIndex = new ArrayList<>();
	//
	// 	for (int i = 0; i < persons.length; i++) {
	// 		if (removedIndex.contains(i)) {
	// 			continue;
	// 		}
	//
	// 		for (int j = 0; j < persons.length; j++) {
	// 			if (removedIndex.contains(j)) {
	// 				continue;
	// 			}
	// 			if (persons[i].isHigher(persons[j])) {
	// 				// System.out.println(persons[i]);
	// 				// System.out.println(persons[j]);
	// 				removedIndex.add(i);
	// 				result++;
	// 				break;
	// 			}
	// 		}
	// 	}
	//
	// 	return persons.length - result;
	// }
}

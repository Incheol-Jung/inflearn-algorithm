package Section9.six;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 09. 14.
 */
public class Main {
	private static int[] arr;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}

		for (int i = 1; i <= m; i++) {
			int source = in.nextInt();
			int target = in.nextInt();
			union(source, target);
		}

		int source = in.nextInt();
		int target = in.nextInt();
		int findA = find(source);
		int findB = find(target);
		System.out.println(findA + "," + findB);
		System.out.println(findA == findB ? "YES" : "NO");
	}

	private static void union(int source, int target) {
		int findA = find(source);
		int findB = find(target);

		if (findA != findB) arr[findA] = findB;

	}

	private static int find(int source) {
		if (source == arr[source]) {
			return source;
		} else {
			return arr[source] = find(arr[source]);
		}
	}

	// public static int find(int v){
	// 	if(v==arr[v]) return v;
	// 	else return arr[v]=find(arr[v]);
	// }
	// public static void union(int a, int b){
	// 	int fa=find(a);
	// 	int fb=find(b);
	// 	if(fa!=fb) arr[fa]=fb;
	// }
}

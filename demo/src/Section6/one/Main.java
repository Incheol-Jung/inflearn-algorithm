package Section6.one;

import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 31.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		for (int a : solution(arr)) {
			System.out.print(a + " ");
		}
	}

	private static int[] solution(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		return arr;
	}

	// public static int[] solution(int[] arr){
	// 	for(int i=0; i<arr.length-1; i++){
	// 		int idx=i;
	// 		for(int j=i+1; j<arr.length; j++){
	// 			if(arr[j]<arr[idx]) idx=j;
	// 		}
	// 		int tmp=arr[i];
	// 		arr[i]=arr[idx];
	// 		arr[idx]=tmp;
	// 	}
	// 	return arr;
	// }
}

package Section3.six;

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
		int maxChangeCount = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(arr, count, maxChangeCount));
	}

	public static int solution(int[] arr, int n, int k){
		int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	// private static int solution(int[] arr, int maxChangeCount, int count) {
	// 	int max = Integer.MIN_VALUE;
	// 	int lt = 0;
	// 	int rt = 0;
	// 	int sum = 0;
	// 	int changeCount = 0;
	// 	int[] ltArr = new int[count];
	//
	// 	for (int i = 0; i < count; i++) {
	// 		if (arr[i] == 0) {
	// 			ltArr[rt++] = i + 1;
	// 			if (changeCount < maxChangeCount) {
	// 				changeCount++;
	// 			} else {
	// 				sum -= ltArr[lt];
	//
	// 				if (lt > 0) {
	// 					sum += ltArr[lt - 1];
	// 				}
	//
	// 				lt++;
	// 			}
	// 		}
	//
	// 		sum++;
	// 		if (max < sum) {
	// 			max = sum;
	// 		}
	// 	}
	//
	// 	return max;
	// }
}

package Section4.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Incheol.Jung
 * @since 2023. 08. 30.
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String content1 = in.next();
		String content2 = in.next();
		System.out.println(solution(content1, content2));
	}

	private static String solution(String content1, String content2) {
		HashMap<Character, Integer> content1HashMap = new HashMap<>();
		HashMap<Character, Integer> content2HashMap = new HashMap<>();

		for (char ch : content1.toCharArray()) {
			content1HashMap.put(ch, content1HashMap.getOrDefault(ch, 0) + 1);
		}

		for (char ch : content2.toCharArray()) {
			content2HashMap.put(ch, content2HashMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entries : content1HashMap.entrySet()) {
			Character key = entries.getKey();
			if (content1HashMap.get(key) != content2HashMap.get(key)) {
				return "NO";
			}
		}

		return "YES";
	}
	// public String solution(String s1, String s2){
	// 	String answer="YES";
	// 	HashMap<Character, Integer> map=new HashMap<>();
	// 	for(char x : s1.toCharArray()){
	// 		map.put(x, map.getOrDefault(x, 0)+1);
	// 	}
	// 	for(char x : s2.toCharArray()){
	// 		if(!map.containsKey(x) || map.get(x)==0) return "NO";
	// 		map.put(x, map.get(x)-1);
	// 	}
	// 	return answer;
	// }
	//
	// public static void main(String[] args){
	// 	Main T = new Main();
	// 	Scanner kb = new Scanner(System.in);
	// 	String a=kb.next();
	// 	String b=kb.next();
	// 	System.out.print(T.solution(a, b));
	// }
}

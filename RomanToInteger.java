import java.util.*;

class RomanToInteger {
	static int convertToInteger(String s) {
		Map<Character, Integer> numsMap = new HashMap<>();

		numsMap.put('I', 1);
		numsMap.put('V', 5);
		numsMap.put('X', 10);
		numsMap.put('L', 50);
		numsMap.put('C', 100);
		numsMap.put('D', 500);
		numsMap.put('M', 1000);

		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i > 0 && numsMap.get(ch) > numsMap.get(s.charAt(i-1)))
				total += numsMap.get(ch) - 2*numsMap.get(s.charAt(i-1));
			else
				total += numsMap.get(ch);
		}

		return total;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test;
		test = scan.nextLine();
		System.out.println(convertToInteger(test));
	}
}





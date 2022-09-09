class SubSequence {
	static boolean isSubSequence(String s, String t) {

		int indexS = 0, indexT = 0;

		while (indexT < t.length()) {
			if (indexS == s.length())
				return true;

			if (s.charAt(indexS) == t.charAt(indexT))
				indexS++;
			indexT++;

		}

		if (indexS == s.length())
			return true;

		return false;
	}

	public static void main(String[] args) {
		String s, t;

		s = "ace";
		t = "abcde";

		System.out.println(isSubSequence(s, t));
	}
}

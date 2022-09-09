class RunningSum {
	static int[] sum (int[] values) {
		int carry = 0;
		int[] res = new int[values.length];

		for (int i = 0; i < values.length; i++) {
			carry += values[i];
			res[i] = carry;
		}

		return res;
	}
	public static void main(String[] args) {
		int[] test  = {1, 2, 3};
		int[] res = sum(test);

		for (int i : res)
			System.out.println(i);
	}


}

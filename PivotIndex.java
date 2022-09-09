class PivotIndex {
	static int getPivot(int[] nums) {
		int totalSum = 0;
		int left, right;
		for (int i : nums)
			totalSum += i;

		left = 0;
		right = totalSum - nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (left == right) return i;

			left += nums[i - 1];
			right -= nums[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] test = {1, 2, 3};
		int res = getPivot(test);

		System.out.println(res);
	}
}

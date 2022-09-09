class RotateArray {
	static void rotate(int[] nums, int k) {
		int numsLen = nums.length;
		int[] finalArr = new int[numsLen];

		for (int i = 0; i < numsLen; i++) {
			finalArr[i] = nums[i];
		}

		for (int i = 0; i < numsLen; i++) {
			nums[(i + k)%numsLen] = finalArr[i];
		}

	}

	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6, 7};
		rotate(test, 3);
		for (var i : test)
			System.out.println(i);
	}
}

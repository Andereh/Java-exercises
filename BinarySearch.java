class BinarySearch {
	static int getPos(int[] nums, int target) {
		int mid; 
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (target == nums[mid])
				return mid;

			if (target > nums[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] test = {3, 4, 5, 6, 7, 8, 9};
		int res = getPos(test, 9);

		System.out.println(res);
	}
}

class SearchInsert {
	static int searchAndInsert(int[] nums, int target) {
		int mid = 0;
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			mid = low + (high - low) / 2;

			if (nums[mid] == target)
				return mid;

			if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return low;
	}

	public static void main(String[] args) {
		int[] test = {1, 3, 5, 6};
		int res = searchAndInsert(test, 4);

		System.out.println(res);
	}
}

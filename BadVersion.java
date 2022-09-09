class BadVersion {
	static boolean isBadVersion(int v) {
		return v >= 6;
	}

	static int getFistBadVersion(int n) {
		int mid; 
		int low = 0, high = n;

		while (low < high) {
			mid = low + (high - low) / 2;

			if (isBadVersion(mid))
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		int test = 9;
		int res = getFistBadVersion(test);

		System.out.println(res);
	}
}

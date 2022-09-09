import java.util.Arrays;

class SquaresOfAnArray {
	static int[] sortedSquare(int[] nums) {
		for (var i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int[] res;
		int[] test = {-5,1, 2, 3, 4};
		res = sortedSquare(test);
		for (var i : res)
			System.out.println(i);
	}
}

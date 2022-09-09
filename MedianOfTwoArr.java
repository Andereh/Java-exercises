import java.util.Arrays;

// calcular la mediana de dos arreglos ordenados, esta no es la mejor forma
class MedianOfTwoArr {
	static double calcMedian(int[] nums1, int[] nums2) {
		int[] swapArr = new int[nums1.length + nums2.length];

		System.arraycopy(nums1, 0, swapArr, 0, nums1.length);
		System.arraycopy(nums2, 0, swapArr, nums1.length, nums2.length);

		Arrays.sort(swapArr);

		if (swapArr.length % 2 == 1) {
			return swapArr[ (swapArr.length) / 2 ];
		} else {
			int centerIndex = swapArr.length / 2;
			return (swapArr[centerIndex] + swapArr[centerIndex - 1]) / 2.0;
		}
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2}; 
		int[] nums2 = {3}; 
		double res = calcMedian(nums1, nums2);

		System.out.println(res);
	}
}

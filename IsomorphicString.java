import java.util.Arrays;

class IsomorphicString {
	static boolean isIsomorphic(String s, String t) {
		char[] s_arr = s.toCharArray();
		char[] t_arr = t.toCharArray();
		
		Arrays.sort(s_arr);
		Arrays.sort(t_arr);

		for (int i = 1; i < s.length(); i++) {
			if (s_arr[i] != s_arr[i-1] || t_arr[i] != t_arr[i-1])
				return false;
		}

		return true;
	}
	public static void main(String[] args) {
		String str1 = "egg";
		String str2 = "add";

		if (isIsomorphic(str1, str2))
			System.out.println("No pues si");
		else
			System.out.println("Parece que no");
	}
}

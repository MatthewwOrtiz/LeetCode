import java.util.ArrayList;
import java.util.List;

public class CommonCharactersDoubleArray {

	public static void main(String args[]){
		String[] A = {"cool","lock","cook"};
		String[] B = {"bella","label","roller"};
		
		System.out.println(commonChars(A));
		System.out.println(commonChars(B));
	}
	
	static int[] arr = new int[26];
	public static List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<String>();
		int[] res = new int[26];
		if (A == null || A.length == 0) {
			return result;
		}
		for (char c : A[0].toCharArray()) {
			arr[c - 'a']++;
		}
		for (int i = 1; i < A.length; i++) {
			updateArr(arr, A[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				result.add((char)(i + 'a') + "");
				arr[i]--;
			}
		}

		// System.out.println(Arrays.toString(arr));
		return result;
	}
	public static void updateArr(int[] arr, String s) {
		int[] temp = new int[26];
		for (char c : s.toCharArray()) {
			temp[c - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (temp[i] < arr[i]) {
				arr[i] = temp[i];
			}
		}   

	}
	
}

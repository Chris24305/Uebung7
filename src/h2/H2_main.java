package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
	/*	int[] test1 = { 5, 3, 7, 3, 4, 7, 8 };
		int[] test2 = { 5, 3, 7, 3, 4, 7, 8 };
		int test3 = 1;
		int test4 = 6;
		int[] result = change(test1, test2, test3, test4);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}	*/
	}

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (end <= start) {
			int[] empty;
			empty = new int[a.length];
			return empty;
		} else {
			if (Arrays.compare(a, b) == 0) {
				Arrays.sort(a);
				int[] sortedA;
				sortedA = Arrays.copyOfRange(a, start, end);
				return sortedA;
			} else {
				int[] copyOfA;
				copyOfA = new int[a.length];
				for (int n = 0; n < a.length; n++) {
					copyOfA[n] = a[n];
				}
				return copyOfA;
			}
		}
	}
}

package h2;

public class H2_main {
	
	public static void main(String[] args) {
		int[] test1 = { 5, 3,7, 3, 4, 7, 9 };
		int[] test2 = { 5, 3,7, 3, 4, 7, 9 };
		int test3 = 2;
		int test4 = 6;
		int[] result = change(test1, test2, test3, test4);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (end > start) { // Anfang end>start block
			int[] copyOfa;
			copyOfa = new int[a.length];
			if (a.length != b.length) {
				for (int i = 0; i < a.length; i++) {
					copyOfa[i] = a[i];
				}
				return copyOfa;
			} else {
				for (int m = 0; m < a.length; m++) {
					if (a[m] != b[m]) {
						for (int i = 0; i < a.length; i++) {
							copyOfa[i] = a[i];
						}
						return copyOfa;
					}
				}
			}
			// falls a und b identisch => a sortieren
			for (int m = 0; m < a.length; m++) {
				for (int n = m; n < a.length; n++) {
					if (a[m] > a[n]) {
						copyOfa[m] = a[n];
						a[n] = a[m];
						a[m] = copyOfa[m];
						m = 0;
					}
				}
			}		//copyOfa initialisieren
			copyOfa = new int[end - start];
			for (int m = 0; m < copyOfa.length; m++) {
				copyOfa[m] = a[m + start];
			}
			return copyOfa;
		} // Ende end>start block
		return a;

	}
}

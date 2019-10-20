package Codechef.com;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		rearrangeElements(arr2);
	}

	private static void rearrangeElements(int[] arr) {
		int n = arr.length;
		int mid = n / 2;
		int j = n - 1;
		if (n % 2 == 0) {
			mid = n / 2 - 1;
		}
		int[] arr2 = new int[n - (mid + 1)];
		int k = 0;
		while (j != mid) {
			arr2[k++] = arr[j];
			arr[j] = -1;
			j--;
		}
		int m = 0, nn = 0;
		for (; m <= mid && nn <= arr2.length - 1; m++, nn++) {
			System.out.print(arr2[nn] + " " + arr[m] + " ");
		}
		if (m <= mid) {
			System.out.print(arr[m]);
		}
		if (nn <= arr2.length - 1) {
			System.out.print(arr2[nn]);
		}
	}

}

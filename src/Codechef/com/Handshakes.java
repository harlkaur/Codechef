package Codechef.com;

import java.util.Arrays;
import java.util.Scanner;

public class Handshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int minHandshake = minNo(arr);
			System.out.println(minHandshake);
		}
	}

	private static int minNo(int[] arr) {
		Arrays.sort(arr);
		int people = arr[0]+arr[1];
		int handshake = arr[0]*arr[1];
		for (int i = 2; i < arr.length; i++) {
			handshake += people*arr[i];
			people += arr[i];
		}
		return handshake;
	}

}

package Codechef.com;

import java.util.Scanner;

public class ChefGroupNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		while (testCases-- > 0) {
			int pos = 0;
			int neg = 0;
			int totalNumber = sc.nextInt();
			int[] scores = new int[totalNumber];
			for (int i = 0; i < totalNumber; i++) {
				scores[i] = sc.nextInt();
				if (scores[i] > 0) {
					++pos;

				} else
					++neg;
			}

			if (pos == 0) {
//				pos = neg;
				System.out.println(neg + " " + neg);
			} else if (neg == 0) {
//				neg = pos;
				System.out.println(pos + " " + pos);
			} else if (neg > pos)
				System.out.println(neg + " " + pos);
			else
				System.out.println(pos + " " + neg);
		}
		sc.close();
	}
}
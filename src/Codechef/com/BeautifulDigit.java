package Codechef.com;

import java.util.Scanner;

public class BeautifulDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while (testCases-- > 0) {
			String N = sc.next();
			String d = sc.next();
			String str = "";
			char min = '9';
			for (int i = 0; i < N.length(); i++) {
				if (N.charAt(i) < d.charAt(0)) {
					str += N.charAt(i);
					if (min > N.charAt(i))
						min = N.charAt(i);
				}
			}
			if (str.length() == N.length()) {
				System.out.println(str);
			} else {
				if (min > d.charAt(0))
					min = d.charAt(0);
				String new_str = String.valueOf(min);
				while (new_str.length() != N.length()) {
					new_str += d.charAt(0);
				}
				while (str.length() != N.length()) {
					str += d.charAt(0);
				}
				if(Integer.parseInt(str) < Integer.parseInt(new_str))
					System.out.println(str);
				else
					System.out.println(new_str);
			}

		}
		sc.close();
	}
}

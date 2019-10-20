package Codechef.com;

public class Twitter {

	public static void main(String[] args) {

		String str = "It's a beautifullllll and wonderful day!!!";
		String str_c = "New feature to add phone number to every co-worker";
		System.out.println(getTweet(str_c));
	}

	private static int getTweet(String str) {
		int count = 0;
		int ans = 0, sum = 0;
		String[] s = str.split(" ");
		//System.out.println(s.length);
		for (int i = 0; i < s.length;) {
			
			if(i==s.length -1)
				sum = sum + s[i].length();
			else
				sum = sum + s[i].length() + 1;
			
			System.out.println(sum);
			
			if(sum > 24) {
				ans++;
				sum = 0;
			}else {
				++i;
			}
			
		}
		return ans;
	}

}

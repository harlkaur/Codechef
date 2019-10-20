package Codechef.com;

public class SmallestPositiveMissingNum {

	public static void main(String[] args) {
		//int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { -12, -45, 39, 32, 0, 13, -36, 17, 17, -29, -34, 15, 15, -26, -44, 8, -9, -30, -25, 41, 38, 29,
				-19, -22, 1, 40, 19, 47, -37, 9, 41, 2, -34, -18, 36, 16, 45, -50, 35, -36, 23, -49, 29 };
		int[] arr2 = { -47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24, 36, 44, -11, 45, 20, -16, 28, 17, -49, 47, -48,
				-33, 42, 2, 6, -49, 30, 36, -9, 15, 39, -6, -31, -10, -21, -19, -33, 47, 21, 31, 25, -41, -23, 17, 6,
				47, 3, 36, 15, -44, 33, -31, -26, -22, 21, -18, -21, -47, -31, 20, 18, -42, -35, -10, -1, 46, -27, -32,
				-5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0, 43, -50, -16, 14, -26 };
		int[] arr3 = {46, -1, 13, 28, -40, 7};
		int result = missingNumber(arr3, arr3.length);
		System.out.println(result);
	}

	static int missingNumber(int arr[], int n) {
		// segregating positive and negative array
		int j = 0, temp; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] > 0) { 
                if (i != j) { 
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
                j++; 
            } 
        } 

        
		// ignore negative values and focus on only positive values
		for (int i = 0; i < n; i++) {
			int tt = Math.abs(arr[i]);
			if ((tt - 1) < n && arr[tt - 1] >=0) {
				arr[tt - 1] = -arr[tt - 1];
			}
		}

		
		// iterating to see which index has positive value
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;
	}

}

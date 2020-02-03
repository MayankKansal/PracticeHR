package Javaprob;

import java.util.Arrays;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int arraySize = 0;

		String ar[] = new String[s.length() - 2];

		try {
			for (int i = 0; i < s.length(); i++) {
				if (k <= s.length()) {
					ar[i] = s.substring(i, k);
					// System.out.print(ar[i]+ " ");
					k++;
					arraySize = i;
				}

			}

			for (int i = 0; i <= arraySize; i++) {
				for (int j = i + 1; j <= arraySize; j++) {
					if (ar[i].compareTo(ar[j]) > 0) {
						String temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
					}
				}
			}

			// Arrays.sort(ar);
			System.out.println(Arrays.toString(ar));

		} catch (Exception e) {

		}

		smallest = ar[0];
		largest = ar[arraySize];
		// System.out.println(arraySize);

		return smallest + "\n" + largest;
		// return "Yes" + "\n" + "No";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSubstringComparisons ob = new JavaSubstringComparisons();
		System.out.println(getSmallestAndLargest("ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH", 1));

	}

}

package Implementation;

import java.util.Arrays;

public class TheHurdleRace {

	static int hurdleRace(int k, int[] height) {

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				if (height[i] < height[j]) {
					int temp = height[i];
					height[i] = height[j];
					height[j] = temp;
				}
			}
		}

		if ((k - height[0]) < 0) {
			return (Math.abs(k - height[0]));
		}

		else
			return 0;
		// System.out.println(Arrays.toString(height));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hurdleRace(4, new int[] { 1, 6, 3, 5, 2 }));

	}

}

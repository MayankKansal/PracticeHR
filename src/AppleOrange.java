import java.util.Vector;

public class AppleOrange {

	void countApplesAndOranges(int s, int t, int a, int b,
			int[] apples, int[] oranges) {
		int appleAthouse = 0;
		int ornageAthouse = 0;
		
		for (int i = 0; i < apples.length; i++) {
			if (a + apples[i] >= s && a + apples[i] <= t ) {
				appleAthouse++;
			}

		}
		System.out.println(appleAthouse);

		for (int j = 0; j < oranges.length; j++) {
			if (b + oranges[j] <= t && b+ oranges[j] >= s) {
				ornageAthouse++;
			}

		}
		System.out.println(ornageAthouse);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppleOrange ob = new AppleOrange();
		ob.countApplesAndOranges(7, 10, 4, 12, new int[]{2,3,-4}, new int []{3,-1000,-4});
	}

}

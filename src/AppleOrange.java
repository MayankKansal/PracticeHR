import java.util.Vector;

public class AppleOrange {

	void countApplesAndOranges(int s, int t, int a, int b,
			int[] apples, int[] oranges) {

		int Sam_start_point = 0;
		int Sam_end_point = 0;

		int applePoint = 0;
		int ornagePoint = 0;
		int appleAthouse = 0;
		int ornageAthouse = 0;
		for (int i = 0; i < apples.length; i++) {
			if (applePoint + apples[i] == Sam_start_point) {
				appleAthouse++;
			}

		}

		for (int j = 0; j < oranges.length; j++) {
			if (applePoint + apples[j] == Sam_end_point) {
				ornageAthouse++;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.Vector;

public class AppleOrange {

	void countApplesAndOranges(int s, int t, int a, int b,
			Vector<Integer> apples, Vector<Integer> oranges) {

		int Sam_start_point = 0;
		int Sam_end_point = 0;

		int applePoint = 0;
		int ornagePoint = 0;
		int appleAthouse = 0;
		int ornageAthouse = 0;
		for (int i = 0; i < apples.size(); i++) {
			if (applePoint + apples.get(i) == Sam_start_point) {
				appleAthouse++;
			}

		}

		for (int j = 0; j < oranges.size(); j++) {
			if (applePoint + apples.get(j) == Sam_end_point) {
				ornageAthouse++;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

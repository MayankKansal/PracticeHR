package Greedy;
import java.util.Arrays;

public class MarcsCakewalk {

	static long marcsCakewalk(int[] calorie) {

		long sum = 0;
		int j = 0;

		for (int i = 0; i < calorie.length; i++) {
			for (int k = i+1; k < calorie.length; k++) {
				if (calorie[i] < calorie[k]) {
					int temp = calorie[i];
					calorie[i] = calorie[k];
					calorie[k] = temp;
				}

			}
		}

		//System.out.println(Arrays.toString(calorie));
		for (int i=0; i<calorie.length;i++) {

			sum = (long) (sum + (Math.pow(2, j) * calorie[i]));
			// System.out.println(Math.pow(2, j) * calorie[i]);
			// System.out.println(sum);
			j++;

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(marcsCakewalk(new int[] { 7, 14, 9, 6 }));
	}

}

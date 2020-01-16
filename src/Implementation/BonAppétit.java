package Implementation;

import java.util.ArrayList;
import java.util.List;

public class BonAppétit {

	static void bonAppetit(List<Integer> bill, int k, int b) {

		int actual = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				actual = actual + bill.get(i);
			}
		}

		actual = actual / 2;
		if (b - actual == 0) {
			System.out.println("Bon Appetit");
		} else
			System.out.println(b - actual);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(3);
		a1.add(10);
		a1.add(2);
		a1.add(9);

		bonAppetit(a1, 1, 7);

	}

}

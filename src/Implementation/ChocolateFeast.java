package Implementation;

public class ChocolateFeast {

	static int chocolateFeast(int n, int c, int m) {
		int initailChoc = 0;
		int initailChoc1 = 0;
		initailChoc = n / c;

		if (m <= initailChoc) {
			if (m == initailChoc) {
				return initailChoc + 1;
			}

			else {
				initailChoc1 = initailChoc;
				while (initailChoc / m >= 1) {
					/*
					System.out.println(initailChoc);
					System.out.println((initailChoc / m));
					System.out.println(initailChoc1);
					*/
					initailChoc1 = initailChoc1 + (initailChoc / m);
					 System.out.println(initailChoc1);
					initailChoc = initailChoc / m + initailChoc % m;
				}
				/*
				  if ((m - initailChoc) <= 1 || (m - initailChoc) <= 0) {
				  initailChoc1 = initailChoc1 + 1; }
				 */

				return initailChoc1;
			}

		} else {
			return initailChoc;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(chocolateFeast(12, 4, 4));

	}

}

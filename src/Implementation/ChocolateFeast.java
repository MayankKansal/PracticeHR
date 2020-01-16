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
				while (initailChoc / m >=1) {
					// initailChoc1 =initailChoc;
					System.out.println(initailChoc);
					System.out.println((initailChoc/m));
					
					System.out.println(initailChoc1);
					initailChoc1 = initailChoc1 + (initailChoc / m);
					System.out.println(initailChoc1);
					initailChoc = initailChoc / m;
				}
				if((m-initailChoc)<=1 || (m-initailChoc)<=0 || m == initailChoc){
					initailChoc1 = initailChoc1 + 1;
				}
				
				return initailChoc1;
			}	

		} else {
			return initailChoc;
		}/*
		 * else return initailChoc + 1;
		 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(chocolateFeast(4586, 14 ,98));

	}

}

package Int;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {

		int count = 0;
		try {
			for (int i = 0; i < c.length - 1; i++) {
				if (c[i] == c[i + 1]) {
					if (c.length - 1 >= i + 2) {
						if (c[i] == c[i + 2]) {
							i++;

						}
					}
					count++;
				} else {
					count++;
					i++;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		/*for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				
					if (c[i] == c[i + 2]) {
						i++;
					}
				count++;
			} else {
				count++;
				i++;
			}
		}
		*/ 

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(jumpingOnClouds(new int[] { 0, 0, 0, 0,1,0 }));
	}

}


public class PlusMinus {

	public void plusminus(int arr[]) {
		
		int plus = 0, minus = 0, zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				plus++;
			}
			else if (arr[i] == 0) {
				zero++;
			} else {
				minus++;
			}
		}
		
		int length=arr.length;
		float postiveRatio= (float)plus/length;
		System.out.println(plus);
		System.out.println(postiveRatio);
		
		float negativeRatio= (float)minus/length;
		System.out.println(minus);
		System.out.println(negativeRatio);
		
		float ZeroRatio= (float)zero/length;
		System.out.println(zero);
		System.out.println(ZeroRatio);
		
	}

	public static void main(String args[]) {

		PlusMinus pl = new PlusMinus();
		pl.plusminus(new int[]{ 4,8,-7, -2, 2, 0 });
	}

}

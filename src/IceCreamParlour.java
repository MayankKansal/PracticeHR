public class IceCreamParlour {

	public int[] iceCreamParlour(int m, int arr[]) {
		int first = 0;
		int second = 0;
		int result [] = null;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				if ((arr[i] + arr[j]) == m) {

					first = i + 1;
					second = j + 1;
					// System.out.println(first);
					// System.out.println(second);

				}

			}

		}
	//	System.out.println(first);
	//	System.out.println(second);
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCreamParlour res = new IceCreamParlour();
		res.iceCreamParlour(5, new int[] { 2, 3, 4 });
	//.out.println(Arrays.to);

	}

}

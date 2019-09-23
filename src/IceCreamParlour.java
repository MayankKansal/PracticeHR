import java.util.Arrays;

public class IceCreamParlour {

	public int[] iceCreamParlour(int m, int arr[]) {
		int first = 0;
		int second = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if ((arr[i] + arr[j]) == m) {

					first = i + 1;
					second = j + 1;
					// System.out.println(first);
					// System.out.println(second);

				}

			}

		}

		System.out.println(first);
		System.out.println(second);
		return new int []{first, second};


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCreamParlour res = new IceCreamParlour();
		System.out.println(Arrays.toString(res.iceCreamParlour(4, new int[] { 2,2, 3, 4 })));
	//.out.println(Arrays.to);

	}

}

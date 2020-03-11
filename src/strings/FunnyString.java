package strings;
public class FunnyString {

	static String funnyString(String s) {

		String r = "";
		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		for (int j = 0; j < s.length() - 1; j++) {
			// System.out.println(Math.abs((((int)s.charAt(j))-((int)s.charAt(j+1)))));
			// System.out.println(Math.abs((((int)r.charAt(j))-((int)r.charAt(j+1)))));
			if (Math.abs((((int) s.charAt(j)) - ((int) s.charAt(j + 1)))) == Math
					.abs((((int) r.charAt(j)) - ((int) r.charAt(j + 1))))) {
				count++;

			} 
		}

		if (count == s.length()-1) {
			return "Funny";
		} else {
			return "Not Funny";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(funnyString("acxz"));
	}

}

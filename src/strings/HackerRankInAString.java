package strings;
/*We say that a string contains the word hackerrank if a subsequence of its characters spell the word
 *  hackerrank. For example, if string  it does contain hackerrank, but  does not. In the second case, 
 *  the second r is missing. If we reorder the first string as , it no longer contains the subsequence 
 *  due to ordering.*/

public class HackerRankInAString {

	static String hackerrankInString(String s) {
		String t = "hackerrank";
		String c = "";
		int j = 0;
		for (int i = 0; i < t.length(); i++) {
			for ( ; j < s.length(); j++) {
				if (t.substring(i, i + 1).equalsIgnoreCase(
						s.substring(j, j + 1))) {
					c = c + s.charAt(j);
					j = j+1;
					System.out.println(c);
					break;
				}

			}
		}

		System.out.println(c);
		if (c.equalsIgnoreCase(t)) {

			return "YES";
		} else
			return "NO";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hackerrankInString("hereiamstackerank"));

	}

}

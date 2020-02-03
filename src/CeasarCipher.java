public class CeasarCipher {

	static String caesarCipher(String s, int k) {

		char a;
		String c = "";

		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			int num = a;
			
			if (a != '-') {
				if (num<= 122 && num>=97) {
					//num = num - 26 + k;
					num = num + k;
					if(num>122)
					num=96+num-122;
				} else if (num <= 90 && num>=65) {
					num = num + k;
					if(num>90)
					num=64+num-90;
				}

				a = (char) num;

				c = c + a;
			} else
				c = c + '-';

		}

		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(caesarCipher("www.abc.xy", 87));
	}

}

public class SuperReducedString {

	static String superReducedString(String s) {
		String resutlrString = null;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i <=sb.length()- 1; i++) {
			System.out.println(i);
			try {
				if ((int) (sb.charAt(i)) == (int) (sb.charAt(i + 1))) {

					s = sb.deleteCharAt(i).toString();
					s = sb.deleteCharAt(i).toString();
					i=0;
					i--;
				}
				
				
				
			} catch (Exception e) {

			}
		}
		if(s.length()==0){
			return "Empty String";
		}

		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(superReducedString("mwkommokwmxjivkkvijxshscbbcshsgwdyqqydwgzpnlzzlnpzvfeaiiaefvyeqjccjqeymhqhiihqhmhaomkkmoahhddymmyddh"));

	}

}

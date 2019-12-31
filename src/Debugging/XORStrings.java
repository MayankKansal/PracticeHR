package Debugging;

public class XORStrings {
		
	public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {   
            if(s.charAt(i) == t.charAt(i))
                res+=  "0";
            else
                res+=  "1";
        }

        return res;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringsXOR("10101", "00101"));
	}

}

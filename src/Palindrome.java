
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "naman";
		String p= "";
		for(int i=s.length()-1; i>=0;i--){
			p= p + s.charAt(i);
			
		}
		if(p.equalsIgnoreCase(s)){
			System.out.println("plaindrome");
		}else
			System.out.println("not palindrome");
	}

}

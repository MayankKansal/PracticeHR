
public class camelCase {

	public static int camelcase(){
		
		String s = "newEra";
		int count =1;
		/*for(int i=s.length()-1;i>=1;i--){
			
			if(Character.isUpperCase(s.charAt(i))){
				//s.substring(i);
				count++;
			}
			
		}*/
		for(char letter : s.toCharArray())
        {
            if(letter < 91 && letter > 64 )
            {
                count++;
            }
        }
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(camelcase());
	}

}

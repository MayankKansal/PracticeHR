
public class AlternatingCharacters {

	static int alternatingCharacters(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++){
			try{
				if(s.substring(i, i+1).equalsIgnoreCase(s.substring(i+1, i+2))){
					count++;
				}
			}
			catch(Exception e){
				
			}
			
		}

		return count;
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(alternatingCharacters("AAAA"));

	}

}

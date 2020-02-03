

public class GridChallenge {
	
	static String gridChallenge(String[] grid) {

		for(int i=0; i<grid.length;i++){
			for(int j=0;j<grid[i].length();j++){
				if(((int)(grid[i].charAt(j+1))-(int)(grid[i].charAt(j)))<=0){
					char temp = grid[i].charAt(j+1);
					System.out.println(	temp);
					
				//	grid[i].charAt(j+1) = grid[i].charAt(j);
				//	grid[i].charAt(j) =temp;
					
					
				}
			}
		}
		
		
		
		return "YES";

    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Double number = -5.5;
	      String result;
	      
	      result = (number > 0.0) ? "positive" : "not positive";
	      System.out.println(number + " is " + result);

		System.out.println(gridChallenge(new String[] {"cba"}));
	}

}

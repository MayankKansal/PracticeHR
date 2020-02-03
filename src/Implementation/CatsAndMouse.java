package Implementation;

public class CatsAndMouse {
	
	static String catAndMouse(int x, int y, int z) {

		if(Math.abs(z-x)> Math.abs(z-y)){
			return "Cat B";
		}
		else if(Math.abs(z-x)< Math.abs(z-y))
		
		return "Cat A";
		
		else
			return "Mouse C";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(catAndMouse(1, 3,2));

	}

}

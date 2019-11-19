

public class Staircase {
	
	public void staircase(int n) {
		
		for(int i=0; i<=n;i++) {
			for(int j=i; j<i-1;j++) {
				System.out.print("#");
			}
			System.out.print(" ");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staircase st= new Staircase();
		st.staircase(4);
	}

}

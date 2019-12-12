public class Staircase {
	
	static void staircase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <i+1; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
			/*for( int i=0; i<n ;i++){
			for (int j=n; j>i+1;j--){
				System.out.print(" ");
			}
			for (int k= 0; k<i+1; k++){
				System.out.print("#");
			}
			System.out.println();
		}*/
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staircase(3);
	}

}

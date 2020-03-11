package Warmup;
/*Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. 
 * The last line is not preceded by any spaces.

Write a program that prints a staircase of size .*/
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

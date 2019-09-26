package Javaprob;

public class LoopII {

	public void series(int a,int b, int n) {
		long result = 1;
		for(int i=0; i<n;i++) {
			
				System.out.println(a+ ( result *= 2) * b);
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopII ob = new LoopII();
		ob.series(0, 2, 10);

	}

}

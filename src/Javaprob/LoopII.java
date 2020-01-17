package Javaprob;

public class LoopII {

	static int  series(int a,int b, int n) {
		/*int result = 0;
		for(int i=0; i<n;i++) {
			
				result =  (int) (a+  Math.pow(2, i)*b);
				//System.out.print("Pow "+ Math.pow(2, i)*b + "," );
			//	System.out.print("result " +result + ", ");
				if(i==0)
				System.out.print(a+ ( Math.pow(2, i))*b+ " ");
				else
				System.out.print(a+ result+ " ");
				//a=(int) (( Math.pow(2, i))*b);
			
		}*/
		
		int sum = a+b;
        for(int j=1; j<=n; j++){
            System.out.print(sum+" ");
            sum+=((Math.pow(2,j))*b);
            
        }
        return sum;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		series(5,3,5);

	}

}


public class DivisibleSumPair {
	
	 static int divisibleSumPairs(int n,int k, int ar[]) {
		 int count=0;
		 for(int i=0; i<n-1;i++) {
			 for(int j=i;j<n-1;j++) {
				 if((ar[i]+ar[j+1])%k==0) {
					  count++;
				  } 
			 }
			  
		 }
		 
		 return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(divisibleSumPairs(6, 3, new int[] {1,3,2,6,1,2}));
	}

}

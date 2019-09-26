import java.util.Arrays;


public class circularArray {
	
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int []result = null;	
		int length =a.length;
		int queriesl =queries.length;
		for(int i=0; i<=k;i++){
			for (int j=0;j<a.length;j++ ){
				a[j]=a[length-1];
				a[j+1]=a[j];
				
			}
		}
		
		for (int i=0; i<queries.length;i++){
			result[i]= a[queriesl];
		}
		
		
		return result;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circularArray ob =new circularArray();
		System.out.println(Arrays.toString(ob.circularArrayRotation(new int[]{1,2,3}, 2, new int[]{0,1,2})));

	}

}

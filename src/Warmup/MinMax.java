package Warmup;
import java.util.Arrays;


public class MinMax {
	
	 static void miniMaxSum(int[] arr) {
		 
		 long  minsum=0;
		 long maxsum =0;
		 
		 Arrays.sort(arr);
		 
		 for(int i=0; i<arr.length;i++){
			 if(i<arr.length-1){
				 minsum = minsum+ arr[i];
				 
			 }
			 if(i>0)
			 maxsum = maxsum+ arr[i];
			 
		 }
		 
		/* for (int i=1; i<arr.length;i++){
			 
			 maxsum = maxsum+ arr[i];
		 }
		 for (int i=0; i<arr.length-1;i++){
			 
			 minsum = minsum+ arr[i];
		 }
		*/ 
		 System.out.println(minsum+" "+ maxsum);

	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miniMaxSum(new int[]{1,3,5,7,9});
	}

}

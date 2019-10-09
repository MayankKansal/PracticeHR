import java.util.Arrays;


public class BirthdayCandle {
	
	static int birthdayCakeCandles(int[] ar) {
        int candle =1;
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for(int i=ar.length-1; i>=0;i--){
          try{
        	   if(ar[i]==ar[i-1]) {
               	candle++;	
               }
        	   else
                   break; 
           }
          catch(Exception e){
        	  
          }
                 
        }
    return candle;
    }


	public static void main(String[] args) {
		System.out.println(birthdayCakeCandles(new int[] {5,5,5,5,5,5,5,5}));
	}

}

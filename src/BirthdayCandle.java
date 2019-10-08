import java.util.Arrays;


public class BirthdayCandle {
	
	static int birthdayCakeCandles(int[] ar) {
        int candle =1;
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for(int i=ar.length-1; i>=0;i--){
           
            if(ar[i]==ar[i-1]) {
            	candle++;	
            }
            else
            break;
           
           
        }
    return candle;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(birthdayCakeCandles(new int[] {4,4,4,5,5,1,5,5,1,3}));
	}

}

import java.util.Arrays;


public class BirthdayCandle {
	
	static int birthdayCakeCandles(int[] ar) {
        int candle =1;
        Arrays.sort(ar);
        for(int i=0; i<ar.length-1;i++){
           
            if(ar[i]==ar[i+1])
            candle++;
           
           
        }
    return candle;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(birthdayCakeCandles(new int[] {4,5,1,3}));
	}

}


import java.util.Arrays;


public class SockMerchant {

	int sockMerchant(int n, int [] ar) {

		int pair = 0;
		for (int i = 0; i < ar.length; i++) {
			for(int j=i+1; j<ar.length; j++){
				if (ar[i]==ar[j]) {
					pair++;
				ar= 	ArrayUtils.removeA(ar,j);
					break;
				}
			}
			
		}

		return pair;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SockMerchant sm =new SockMerchant();
		sm.sockMerchant(7, new int[]{1,2,3,1,2,3,3});
		
		
	}

}

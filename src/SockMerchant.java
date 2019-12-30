
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SockMerchant {

	int sockMerchant(int n, Integer [] ar) {

		int pair = 0;
		/*Integer[] ints = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(ints);
		
		List<Integer> al= (Arrays.asList(ar));*/
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			
				al.add(ar[i]);
			}
		
		
		for (int i = 0; i < al.size(); i++) {
				for(int j=i+1; j<al.size(); j++){
					if (al.get(i).equals(al.get(j))) {
						pair++;
					al.remove(j);
						break;
					}
				}
					
			}
		return pair;	
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SockMerchant sm =new SockMerchant();
		System.out.println(sm.sockMerchant(7, new Integer[]{1,2,3,1,2,3,3}));
		
		
	}

}

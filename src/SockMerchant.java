import java.util.ArrayList;
import java.util.Vector;

public class SockMerchant {

	int sockMerchant(int n, Vector<Integer> ar) {

		int pair = 0;
		for (int i = 0; i < ar.size(); i++) {
			for(int j=i+1; j<ar.size(); j++){
				if (ar.get(i)==ar.get(j)) {
					pair++;
					ar.remove(j);
					break;
				}
			}
			
		}

		return pair;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SockMerchant sm =new SockMerchant();
		Vector<Integer> al = new Vector<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(2);
		al.add(3);
		System.out.println(sm.sockMerchant(7, al));
		
		
	}

}

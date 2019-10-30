import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {

	public int nonDivisibleSubset(int k, List<Integer> s) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < s.size(); i++) {
			for (int j = i; j < s.size()-1; j++) {
				if ((s.get(i) + s.get(j + 1)) % k != 0) {
					if(!(al.contains(i))) {
						al.add(i);
					}
					//break;
				}
			}
			
		}

		return al.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonDivisibleSubset ob = new NonDivisibleSubset();
		ArrayList<Integer> ml = new ArrayList<Integer>();
		ml.add(1);
		ml.add(7);
		ml.add(2);
		ml.add(4);
		System.out.println(ob.nonDivisibleSubset(3, ml));

	}

}

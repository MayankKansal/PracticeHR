import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {

	public int nonDivisibleSubset(int k, List<Integer> s) {

		int size = s.size();
		int count = 0;
	ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			if (size == 1) {
				count++;
				return count ;
			} else {
				for (int j = i; j < size - 1; j++) {
					if ((s.get(i) + s.get(j + 1)) % k != 0) {
					
						if(!al.contains(i)){
							al.add(i);
						}
						
					}

				}

			}
			
		}
		if(s.get(size-1)% k !=0){
			al.add(size-1);
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

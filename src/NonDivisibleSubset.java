import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {

	public int nonDivisibleSubset(int k, List<Integer> s) {

		int size = s.size();
		int count = 0;
		if (size == 1) {
			count++;
			return count;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			{
				for (int j = i; j < size - 1; j++)

				{
					System.out.println((s.get(i) + s.get(j + 1)) % k);
					if ((s.get(i) + s.get(j + 1)) % k != 0) {

						if (!al.contains(i)) {
							al.add(i);
							System.out.println("sizenow"+ al.size());
						}

					}

				}

			}

		
		if (s.get(size - 1) % k != 0) {
			al.add(size - 1);
			System.out.println("sizenow"+ al.size());
		}
		return al.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonDivisibleSubset ob = new NonDivisibleSubset();
		ArrayList<Integer> ml = new ArrayList<Integer>();
		ml.add(278);
		ml.add(576);
		ml.add(496);
		ml.add(727);

		ml.add(410);
		ml.add(124);
		ml.add(338);
		ml.add(149);

		ml.add(209);
		ml.add(702);
		ml.add(282);
		ml.add(718);

		ml.add(771);
		ml.add(575);
		ml.add(436);

		// 278 576 496 727 410 124 338 149 209 702 282 718 771 575 436
		System.out.println(ob.nonDivisibleSubset(7, ml));

	}

}

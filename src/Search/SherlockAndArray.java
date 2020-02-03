package Search;
import java.util.ArrayList;
import java.util.List;

/*Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that 
 * the sum of all elements to the left is equal to the sum of all elements to the right. For instance, 
 * given the array ,  is between two subarrays that sum to . If your starting array is , that element 
 * satisfies the rule as left and right sum to .*/

public class SherlockAndArray {

	static String balancedSums(List<Integer> arr) {
	//	int sumL = 0;
		//int sumR = 0;
		String s = "NO";
		int a;
		for (int i = 0; i <= arr.size() - 1; i++) {

			a = arr.get(i);
		int	sumL = 0;
		int	sumR = 0;

			for (int j = i + 1; j < arr.size(); j++) {
				sumL += arr.get(j);
			}

			for (int k = i - 1; k >= 0; k--) {
				sumR += arr.get(k);
			}

			if (sumL == sumR) {
				s = "YES";
				break;

			}

		}
		//System.out.println(sumL);
	//	System.out.println(sumR);
		return s;

	/*	
		int n = arr.size();
	      int i = 0;
	      int j = n-1;
	      int left = 0;
	      int right = 0;
	      while ( i < n && j >= 0)
	      {
	            if ( left == right && i == j) {
	                return "YES";
	            }
	            if ( left > right) {
	                right += arr.get(j);
	                j--;
	            } else
	            {
	                left += arr.get(i);
	                i++;
	            }
	      }
	      return "NO";*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println(balancedSums(al));

	}

}

public class BigArraySum {

	public long aVeryBigSum(long arr[]) {

		long sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigArraySum obj = new BigArraySum();
		System.out.println(obj.aVeryBigSum(new long[] { 1000000001, 1000000002,
				1000000003, 1000000004, 1000000005 }));

	}

}

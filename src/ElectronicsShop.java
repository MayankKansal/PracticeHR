/*Monica wants to buy a keyboard and a USB drive from her favorite electronics store. The store has several
 models of each. Monica wants to spend as much as possible for the  items, given her budget.

 Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the 
 amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive, 
 print -1 instead. She will buy only the two required items.*/

import java.util.Arrays;
public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		//Arrays.sort(keyboards);
		//Arrays.sort(drives);
		System.out.println(keyboards.length);
		System.out.println(drives.length);
		int max = 0;
				//max1 =keyboards[keyboards.length-1] + drives[drives.length-1];
		System.out.println(max);

		for (int i = keyboards.length-1; i >= 0; i--) {
			for (int j = drives.length-1; j >= 0; j--) {
				// max= ;
				if (keyboards[i] + drives[j]<= b && keyboards[i] + drives[j]>=max) {
					max = keyboards[i] + drives[j];
					/*if(max<=b){
					max = keyboards[i] + drives[j];
					System.out.println(max);
					}*/

				}
				/*else if(keyboards[i] + drives[j]>= b){
					max =keyboards[i] + drives[j];
				}*/
			}
		}

		if (max <= b && max >0) {
			return max;
		} else
			return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMoneySpent(new int[]{3,1}, new int[]{5,2,8}, 10));

	}

}

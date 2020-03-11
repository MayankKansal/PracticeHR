import java.util.ArrayList;
import java.util.Arrays;


public class RemoveSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[]{1,1,1,1,2,2,3,4,5,6,3,5};
		Arrays.sort(arr);
		ArrayList<Integer> ls= new ArrayList<Integer>();
		for(int i: arr){
			ls.add(i);
		}

		for(int i=0; i<ls.size()-1;i++){
			if(ls.get(i)==ls.get(i+1)){
				ls.remove(i+1);
				System.out.println(ls);
				

			}
		}
		System.out.println(ls);

	}

}
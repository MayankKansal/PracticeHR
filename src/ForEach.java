import java.util.ArrayList;


public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  arr[] =new String[]{"aa","ab","ac","ad","aa","aa","aa"};
		ArrayList <Integer> ls = new ArrayList<Integer>();
		for(String i :arr ){
			
			ls.add(i);
		}
		System.out.println(ls);

	}

}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

	public List <Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		int bobwin =0;
		int alicewin=0;
		int tie=0;
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<a.size();i++) {
			
				if(a.get(i)<b.get(i)) {	
					bobwin++;
					
				}else if(a.get(i)>b.get(i)) {
					alicewin++;	
				}
					
			}
			
		result.add(alicewin);
		result.add(bobwin);
		return result;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triplets tr = new Triplets();
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(8);
		al.add(5);
		al.add(8);
		
		ArrayList <Integer> bl = new ArrayList<Integer>();
		bl.add(5);
		bl.add(7);
		bl.add(6);
		bl.add(4);
		
		System.out.println(tr.compareTriplets(al, bl));
		

	}


}

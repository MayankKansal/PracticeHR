
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
		

	}


}

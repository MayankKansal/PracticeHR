import java.util.Arrays;

public class Triplets {

	public void compareTriplets(int alice[], int bob[]) {
		
		int bobwin =0;
		int alicewin=0;
		int tie=0;
		for(int i=0; i<alice.length;i++) {
			
				if(alice[i]<bob[i]) {	
					bobwin++;
					
				}else if(alice[i]>bob[i]) {
					alicewin++;	
				}
					
			}
			
		int result []= {alicewin, bobwin};
		
		System.out.println("alice " + alicewin);
		System.out.println("bob " + bobwin);
		System.out.println("tie " + tie);
		
		System.out.println(Arrays.toString(result));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triplets tr = new Triplets();
		tr.compareTriplets(new int[]{5,6,9}, new int[]{4,5,9});

	}


}

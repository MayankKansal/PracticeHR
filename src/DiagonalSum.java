import java.util.ArrayList;
import java.util.List;


public class DiagonalSum {

	public static int  diagonalDifference(List<List<Integer>> arr){
		//ArrayList<Integer> al = new ArrayList<Integer>();
	//	ArrayList<Integer> bl = new ArrayList<Integer>();
		int Ltotal=0;
		int Rtotal=0;
		for(int i=0; i<arr.size();i++)
		{
			for(int j=0; j<arr.get(i).size();j++){
				if(i==j){
				//al.add(arr.get(i).get(j));
				Ltotal+=arr.get(i).get(j);
				}
				if(i==arr.size()-j-1)
				{
					//bl.add(arr.get(i).get(j));
					Rtotal+=arr.get(i).get(j);
				}
				
			}
		}
		
		/*for( int n: al){
			Ltotal+=n;
		}
		for( int n: bl){
			Rtotal+=n;
		}*/
	//	System.out.println(al);
		//System.out.println(bl);
		return Math.abs(Ltotal-Rtotal);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(1); 
        a1.add(2); 
        ArrayList arr1 = new ArrayList();
		arr1.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5); 
        a2.add(15);
        a2.add(25);
        arr1.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(10); 
        a3.add(20); 
        a3.add(30); 
        arr1.add(a3); 
        System.out.println(diagonalDifference(arr1));

	}

}

import java.util.ArrayList;
import java.util.List;


public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<grades.size();i++){
			if(grades.get(i)>=38){
				if((grades.get(i)%5)>=3 ){
					al.add(((grades.get(i)/5)+1)*5);
				}else{
					al.add(grades.get(i));
				}
			}else{
				al.add(grades.get(i));
			}
			
		}
		
		//System.out.println(al);
		return al;
	   

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> bl = new ArrayList<Integer>();
		bl.add(73);
		bl.add(67);
		bl.add(38);
		bl.add(33);
		
		System.out.println(gradingStudents(bl));

	}

}

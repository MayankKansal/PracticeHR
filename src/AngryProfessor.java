
public class AngryProfessor {

	
	static String angryProfessor(int k, int[] a) {
        String N= "YES";
        String Y= "NO";
        int studentontime=0;
        for (int i=0; i<a.length;i++){
            if(a[i]<=0){
                studentontime++;
            }
        }
        if(studentontime<k){
                return N;
            }else
            return Y;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AngryProfessor ob = new AngryProfessor();
		System.out.println(ob.angryProfessor(4, new int[] {-1,-1,-2,0,0,2,3,4}));
	}

}

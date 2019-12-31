package Implementation;
import java.util.Arrays;


public class BreakingTheRecords {

	static  int[] breakingRecords(int[] scores) {
		int min=scores[0] , max=scores[0];
		int arr[] = new int[2];
		int mincount=0, maxcount=0;
		/*arr[0]= mincount;
		arr[1]= maxcount;*/
		for(int i=1; i<=scores.length-1;i++){
			
			if(scores[i]<min){
				mincount++;
				arr[1]=mincount;
				min= scores[i];
			}else if(scores[i]>max){
				maxcount++;
				arr[0]=maxcount;
				max= scores[i];
			}
		}
		
		return arr;
			//System.out.println(mincount + " " + maxcount);

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(breakingRecords(new int[]{10,5,20,20,4,5,2,25,1})));
// int arr[] = new int[]{1,6,45,4};
 
	}

}

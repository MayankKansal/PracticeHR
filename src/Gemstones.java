import java.util.Arrays;


public class Gemstones {
	
	static int gemstones(String[] arr) {
		int count=0;
		System.out.println(arr.length);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++){
		//	String s =arr[i+1];
			//String r=arr[i+2];
			for(int j=0;j<arr.length;j++){
				if(arr.length>=i+2)
				if(arr[i+1].contains(arr[i].substring(j, j+1)) && arr[i+2].contains(arr[i].substring(j, j+1))){
					count++;
					System.out.println(count);
					System.out.println(arr[i].substring(j, j+1));
				}
			}
			
		}

		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gemstones(new String[]{"basdfj","asdlkjfdjsa","bnafvfnsd","oafhdlasd"}));

	}

}

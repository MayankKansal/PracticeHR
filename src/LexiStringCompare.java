import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LexiStringCompare {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        ArrayList<String> al = new ArrayList<String>();
        String ar[] = new String[s.length()];
       
        
        try {
        	 for(int i=0; i<s.length();i++) {
             	ar [i] =s.substring(i, k);
             	System.out.println(ar[i]);
             	k++;
             }
        	 Arrays.sort( ar ); 	
        }
        catch(Exception e) {
        	
        }
        int size = ar.length;
        System.out.println(Arrays.toString(ar));
        
        System.out.println(Arrays.toString(ar));
        smallest =ar[0];
        largest=ar[size-1];
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexiStringCompare ob =new LexiStringCompare();
		System.out.println(ob.getSmallestAndLargest("welcomejava", 3));

	}

}

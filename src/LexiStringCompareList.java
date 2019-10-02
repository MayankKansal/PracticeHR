import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LexiStringCompareList {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        ArrayList<String> al = new ArrayList<String>();
      //  String ar[] = new String[s.length()];
       
        
        try {
        	 for(int i=0; i<s.length();i++) {
             	
             	al.add(s.substring(i, k));
             	k++;
             }
        	 
        }
        catch(Exception e) {
        	
        }
        System.out.println(al);
   	 Collections.sort( al ); 	
   	 System.out.println(al);
   	
        smallest =al.get(0);
        System.out.println(smallest);
        largest=al.get(al.size()-1);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexiStringCompareList ob =new LexiStringCompareList();
		System.out.println(ob.getSmallestAndLargest("welcomeedqjtsdjava", 3));


	}

}

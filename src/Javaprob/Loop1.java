package Javaprob;

public class Loop1 {
	int sum= 0;
	public void loop(int n){
		for(int i=1; i<=10;i++){
			sum= n*i;
			if(i!=10)
			System.out.println(n + " x " + i +" = "+sum);
			else
			System.out.print(n + " x " + i +" = "+sum);	
	}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 ob = new Loop1();
		ob.loop(7);
	}

}

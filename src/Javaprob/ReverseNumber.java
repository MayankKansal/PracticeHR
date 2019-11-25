package Javaprob;

public class ReverseNumber {

    static int  reverseNumber(int n){
        int  newNumber=0;
     while(n>0) {
          int div  =n%10;
      //    System.out.println(div);
          newNumber=newNumber*10+div;
          System.out.println(newNumber);
          n=n/10;
      }


        return newNumber;
    }




    public static void main(String [] args){

        System.out.println(reverseNumber(547));

    }

}

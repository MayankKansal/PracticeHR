public class StrongPassword {
    static int minNumber(int n, String password){
    char c;
    int count=0;
    String specialChars ="!@#$%^&*()-+";
    for(int i=0; i<password.length();i++){
        c= password.charAt(i);
        if( ('a' <= c && c <= 'z') // Checks if it is a lower case letter
                && ('A' <= c && c <= 'Z') //Checks if it is an upper case letter
                && ('0' <= c && c <= '9')){
            count++;

        }else if (specialChars.contains(password.substring(i, 1))) {
            count++;
        }
        else if(password.length()<6){
            count++;
        }

    }

        return count;
    }

    public static void main(String [] args){
            System.out.println(minNumber(3, "#HackerRank"));
    }

}

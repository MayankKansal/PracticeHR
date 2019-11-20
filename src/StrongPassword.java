public class StrongPassword {
    static int minNumber(int n, String password){
    char c;
    int count=0;
    String specialChars ="!@#$%^&*()-+";
    int sc=0;
    String lowercase ="abcdefghijklmnopqrstuvwxyz";
    int lc=0;
    String uppercase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int uc=0;
    String number= "0123456789";
    int nc=0;
    for(int i=0; i<password.length();i++){
        c= password.charAt(i);
        /*if( (!('a' <= c && c <= 'z')) // Checks if it is a lower case letter
                || (!('A' <= c && c <= 'Z')) //Checks if it is an upper case letter
                || (!('0' <= c && c <= '9'))){
            count++;

        }*/ 
        if (lowercase.contains(password.substring(i, i+1))) {
            lc++;
        }
        else if (uppercase.contains(password.substring(i, i+1))) {
            uc++;
        }
        else if (number.contains(password.substring(i, i+1))) {
            nc++;
        }
        else if (specialChars.contains(password.substring(i, i+1))) {
            sc++;
        }
    }

    while (Math.abs(6-n)<(lc+uc+nc+sc) && count<(Math.abs(6-n))){
        count++;
    }

        return count;
    }

    public static void main(String [] args){
            System.out.println(minNumber(3, "#Ab"));
    }

}

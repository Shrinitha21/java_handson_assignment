
import java.util.*;
import java.lang.*;

public class Password{
    
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
        		"A valid password should satisfy the following rules.\n"+
        		"1. It should be minimum of 8 characters in length.\n"+
        		"2. It should have at least one lower case letter,one upper case letter,"+
        		"one digit and one special character\n"+
                "Input a password: ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println(" Valid Password");
        } else {
            System.out.println("Not a valid password");
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;int upchar = 0;
        int numCount = 0;int spl = 0;int lowchar =0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)) 
            	 upchar++;
            else if(Character.isLowerCase(ch))
            	lowchar++;
            else if(Character.isDigit(ch))
            	numCount++;
            else if(ch==' ')
            	continue;
            else 
            	spl++;
        }

       if(upchar>0&&lowchar>0&&numCount>0&&spl>0)
    	   return true;
       return false;
    }

   

}

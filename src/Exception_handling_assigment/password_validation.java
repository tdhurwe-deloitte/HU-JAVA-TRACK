package Exception_handling_assigment;

import java.util.Scanner;

public class password_validation {

    static boolean validation(String str)
    {
            boolean is_upper = false;
            boolean is_lower = false;
            boolean is_special = false;
            boolean is_digit = false;
            if(str.length() >= 5 && str.length() <=10)
            {
                for(int i = 0; i < str.length(); i++) {
                    if (Character.isDigit(str.charAt(i))) {
                        is_digit = true;
                    } else if (Character.isUpperCase(str.charAt(i))) {
                        is_upper = true;
                    } else if (Character.isLowerCase(str.charAt(i))) {
                        is_lower = true;
                    } else if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                        is_special = true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
    }

    public static void main(String[] args) {
        String str;
        boolean k;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        k = validation(str);
        try {
            if(k)
            {
                System.out.println("Password created successfully");
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred " + e);
        }
    }
}

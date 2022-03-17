import java.util.Scanner;

public class Strings {

    static void is_valid(String s1, String s2, String s3)
    {
        int a = s1.length();
        int b = s2.length();
        String string4;
        boolean valid_shuffle = true;
        if(a + b != s3.length())
        {
            System.out.println("Invalid Shuffle");
        }
        else
        {
            for(int i = 0; i < s3.length() && valid_shuffle == true; i++)
            {
                if(s3.charAt(i) != s2.charAt(i) || s3.charAt(i+1) != s1.charAt(i)) {
                    valid_shuffle = false;
                }
            }
            if(valid_shuffle == true)
            {
                System.out.println("Valid Shuffle");
            }
            else
            {
                System.out.println("valid Shuffle");
            }
        }
    }

    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        str1 = sc.nextLine();
        System.out.println("Enter 2nd string");
        str2 = sc.nextLine();
        System.out.println("Enter third string");
        str3 = sc.nextLine();
        is_valid(str1, str2, str3);
    }
}

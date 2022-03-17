import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

    public static boolean check_anagram(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() != s2.length())
        {
            return false;
        }
        else
        {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean res = Arrays.equals(arr1, arr2);
            if(res)
            {

                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String str1, str2;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        str2 = sc.nextLine();
        result = check_anagram(str1, str2);
        if(result)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Strings are not anagrams");
        }

    }
}

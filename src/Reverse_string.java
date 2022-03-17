import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse_string {

    public static void reverse_string(String s1)
    {
        String arr[] = s1.split(" ");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        reverse_string(str1);
    }
}

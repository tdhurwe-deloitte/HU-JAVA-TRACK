package Exception_handling_assigment;

import java.util.Scanner;

public class arithmetic_exception {

    static void some_function(int num1, int num2)
    {
        try
        {
            int some_data;
            some_data = num1/num2;
            System.out.println(num1 + "/" + num2 +" = "+ some_data);
        }
        catch(ArithmeticException e)
        {
            System.out.println("An exception occurred : " + e);
        }
        finally {
            System.out.println("Thank you !");
        }
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        some_function(num1, num2);
    }
}

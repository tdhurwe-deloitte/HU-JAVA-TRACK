package Main_Assignment;

import java.util.Scanner;

public class menu {
    public static void options(String uname){
        System.out.println("___________________Welcome to user database___________________");
        int num;
        System.out.println("1 . Add user data\n2 . List user data\n3 . Update user data\n4 . Delete user data\n5 . Exit");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch (num){
            case 1:
                AddData.add_data(uname);
                break;
            case 2:
                System.out.println("list user data");
                break;
            case 3:
                System.out.println("update user data");
                break;
            case 4:
                System.out.println("delete user data");
                break;
            case 5:
                System.out.println("Thank you");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
    }

    public static void main(String[] args) {
        options("random");
    }
}

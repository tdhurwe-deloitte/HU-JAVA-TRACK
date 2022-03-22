package Main_Assignment;

import java.util.Scanner;
class Functions{
    public String uname;
    public void set_uname(String user){
        uname = user;
    }
    public void choice(){   // to make choice
        int choice;
        System.out.println("_______________Welcome to user database_______________");
        System.out.println("1 . Login");
        System.out.println("2 . Registration");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){
            case 1:         // login option
                String uname;
                uname = login.check_cred();
                if(uname.equals("Invalid")){
                    choice();
                }
                else{
                    set_uname(uname);
                    menu.options(uname);
                }
                break;

            case 2:         //register option
                String user_name;
                user_name = register.reg();
                if(user_name.equals("Error")){
                    System.out.println("_________________Registration unsuccessful_________________");
                    choice();
                }
                else
                {
                    set_uname(user_name);
                    menu.options(user_name);
                }
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Functions function_obj = new Functions();
        function_obj.choice();
    }
}

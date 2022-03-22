package Main_Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class login {
    public static String check_cred(){
        String username, password;
        String path = "src\\employee.csv";
        String line = "";
        BufferedReader reader = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("_____________________Login_____________________");
        System.out.print("Enter username : ");
        username = sc.nextLine();
        System.out.println();
        System.out.print("Enter password : ");
        password = sc.nextLine();
        System.out.println();
        try {
            reader = new BufferedReader(new FileReader(path));
            first:
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                for(String index: row)
                {
                    if(username.equals(row[0]) && password.equals(row[1]))
                    {
                        System.out.println("Successfully Logged in");
                        return username;
                    }
                    else if(username.equals(row[0]) && !password.equals(row[1]))
                    {
                        break first;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "Invalid";
    }
    public static void main(String[] args) {
        check_cred();
    }
}

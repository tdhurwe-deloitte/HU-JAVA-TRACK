package Main_Assignment;

import java.io.*;
import java.util.Scanner;

public class register {
    public static boolean check_uname(String uname){
        String path = "src\\employee.csv";
        String line = "";
        BufferedReader reader = null;
        Boolean is_present = false;
        try {
            reader = new BufferedReader(new FileReader(path));
            first:
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                for(String index:row)
                {
                    if(uname.equals(row[0]))
                    {
                        reader.close();
                        is_present = true;
                        break first;
                    }

                }
            }
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        return is_present;
    }

    public static boolean check_pass(String p1, String p2){
        if(p1.equals(p2) && p1.length()>=5 && p1.length()<=10)
        {
            boolean is_digit = false;
            boolean is_upper = false;
            boolean is_lower = false;
            boolean is_special = false;
            for(int i = 0; i < p1.length(); i++)
            {
                if(Character.isDigit(p1.charAt(i)))
                {
                    is_digit = true;
                }
                else if(Character.isUpperCase(p1.charAt(i))){
                    is_upper = true;
                }
                else if(Character.isLowerCase(p1.charAt(i)))
                {
                    is_lower = true;
                }
                else if(!Character.isLetter(p1.charAt(i)) && !Character.isDigit(p1.charAt(i)) && !Character.isWhitespace(p1.charAt(i)))
                {
                    is_special = true;
                }
                else {
                    return false;
                }
            }
            return is_digit && is_lower && is_upper && is_special;
        }
        return false;
    }

    public static void create_registry(String uname, String pass){
        String path = "src\\employee.csv";
        String id_val = "DC-00", str, k;
        try {
            FileWriter writer = new FileWriter(path, true);
//            writer.append("\n");
            writer.append(uname);
            writer.append(",");
            writer.append(pass);
            writer.append(",");
            writer.append("DC-00"+Math.random());
//            writer.append(",");
            AddData.add_data(uname);
            writer.close();
            System.out.println("Registered successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String reg(){
        String uname, pass1, pass2;
        Scanner sc = new Scanner(System.in);
        System.out.println("________________________Registration________________________");
        System.out.print("Enter Username : ");
        uname = sc.nextLine();
        System.out.println();
        System.out.print("Enter Password : ");
        pass1 = sc.nextLine();
        System.out.println();
        System.out.print("Re-enter Password : ");
        pass2 = sc.nextLine();
        boolean user = check_uname(uname);
        boolean password = check_pass(pass1, pass2);
        try {
            if (password && !user) {
                create_registry(uname, pass1);
                return uname;
            }
        }
        catch (Exception e){
            System.out.println("Some error occurred");
        }
        return "Error";
    }

    public static void main(String[] args) {
        reg();
    }
}

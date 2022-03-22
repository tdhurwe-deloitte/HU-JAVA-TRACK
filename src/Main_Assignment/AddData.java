package Main_Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AddData {
    public static void insert_data(String user){
        String path = "src\\employee.csv";
        String name, company_name, designation, address;
        int age, salary, phone_num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Age : ");
        age = sc.nextInt();
        String k = Integer.toString(age);
        System.out.println();
        System.out.print("Company name : ");
        company_name = sc.nextLine();
        System.out.println();
        System.out.print("Designation : ");
        designation = sc.nextLine();
        System.out.print("Salary : ");
        salary = sc.nextInt();
        System.out.println();
        String s = Integer.toString(salary);
        System.out.println("Address : ");
        address = sc.nextLine();
        System.out.println();
        System.out.println("Phone no : ");
        phone_num = sc.nextInt();
        System.out.println();
        String p = Integer.toString(phone_num);
        try{
            FileWriter writer = new FileWriter(path, true);
            writer.append(",");
            writer.append(name);
            writer.append(",");
            writer.append(k);
            writer.append(",");
            writer.append(company_name);
            writer.append(",");
            writer.append(designation);
            writer.append(",");
            writer.append(s);
            writer.append(",");
            writer.append(address);
            writer.append(",");
            writer.append(p);
            writer.append(",\n");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error : " + e);
        }
        menu.options(user);
}
    public static void add_data(String user){
        String path = "src\\employee.csv";
        String line = "";
        BufferedReader reader = null;
        Scanner sc = new Scanner(System.in);
        try{
            reader = new BufferedReader(new FileReader(path));
            first:
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    if (user.equals(row[0])) {
                        insert_data(user);
                        break first;
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Some error occurred");
        }
    }
}

package Main_Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {



    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println(1);
            writer.close();
            File obj = new File("the-file-name.txt");
            Scanner myReader = new Scanner(obj);
            String data = myReader.nextLine();
            int i = Integer.parseInt(data);
            String k = "abc"+i;
            System.out.println(k);
            myReader.close();
        }
        catch (Exception e)
        {
            System.out.println("hell happen");
        }
    }
}

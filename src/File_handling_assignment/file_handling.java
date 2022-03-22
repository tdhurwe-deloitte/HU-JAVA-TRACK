package File_handling_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class file_handling {
    public static void main(String[] args) {
        String file_path = "C:\\Users\\tdhurwe\\Documents\\java assignment solution\\StudentData.csv";
        BufferedReader reader = null;
        String line = "";
        FileWriter writer = null;
        int i;
        try {
            writer = new FileWriter("Selectedstudent.csv");
            writer.append("Name");
            writer.append(",");
            writer.append("reg no-10");
            writer.append(",");
            writer.append(("reg no-12"));
            writer.append(",");
            writer.append("reg no-B.tech");
            writer.append(",");
            writer.append("rank");
            writer.append("\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            reader = new BufferedReader(new FileReader(file_path));
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                for(String index:row)
                {
                    System.out.printf("%-10s", index);
                    i = 5;
                    if(i <=5)
                    {
                        writer.append(row[0]);
                        writer.append(",");
                        writer.append(row[1]);
                        writer.append(",");
                        writer.append(row[2]);
                        writer.append(",");
                        writer.append(row[3]);
                        writer.append(",");
                        writer.append(row[4]);
                        writer.append("\n");

                    }

                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e);
        }
    }
}

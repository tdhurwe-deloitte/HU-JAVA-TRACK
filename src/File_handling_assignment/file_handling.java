package File_handling_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class file_handling {
    public static void main(String[] args) {
        String file_path = "C:\\Users\\tdhurwe\\Documents\\java assignment solution\\StudentData.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file_path));
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                for(String index:row)
                {
                    System.out.printf("%-10s", index);
                    System.out.println(row[4]);

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

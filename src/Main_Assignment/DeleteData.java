package Main_Assignment;

import java.io.*;

public class DeleteData {
    public static void delete_data(String user) {
        try {
            File file = new File("employee.csv");
            File tempFile = new File("temp_emp.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String lineToRemove = user;
            String curr_line;
            while((curr_line = reader.readLine()) != null)
            {
                String trimmedLine = curr_line.trim();

                if(trimmedLine.equals(lineToRemove)) continue;

                writer.write(curr_line + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

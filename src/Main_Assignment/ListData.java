package Main_Assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListData {
    public static void list_data(String user){
        String path = "src\\employee.csv";
        String line = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            first:
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    if (user.equals(row[0])) {
                        System.out.println(index);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

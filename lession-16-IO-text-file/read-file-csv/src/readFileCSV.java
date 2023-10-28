import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readFileCSV {
    public void Reader(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] string = line.split(",");
                System.out.println("Id of country: " + string[0] + ", shortcut = " + string[1]
                        + ", name = " + string[2]);
            }
            reader.close();
        }
        catch (Exception e){
            System.out.println("File not exist or error content");
        }
    }
}

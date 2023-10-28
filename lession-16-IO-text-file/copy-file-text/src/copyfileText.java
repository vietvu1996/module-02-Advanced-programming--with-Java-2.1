import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class copyfileText {
    public List<String> readFile(String sourceFilePath){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(sourceFilePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
            reader.close();
        }
        catch (Exception e){
            System.out.println("File does not exist");
        }
        return list;
    }

    public void writeFile(String targetFilePath, List<String> list){
        try {
            FileWriter writer = new FileWriter(targetFilePath);
            for (String a: list) {
                writer.write(a + "\n");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void copyFileText(String sourceFilePath, String targetFilePath){
        List<String> list = readFile(sourceFilePath);
        writeFile(targetFilePath, list);
    }

    public void copyFile(String sourceFilePath, String targetFilePath){
        try {
            File fileSource = new File(sourceFilePath);
            File fileTarget = new File(targetFilePath);
            if(!fileSource.exists() || !fileTarget.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader1 = new BufferedReader(new FileReader(fileSource));
            BufferedWriter reader2 = new BufferedWriter(new FileWriter(fileTarget));

            String line;

            while ((line = reader1.readLine()) != null){
                reader2.write(line + "\n");
            }
            reader1.close();
            reader2.close();
        }
        catch (Exception e){
            System.out.println("File does not exist or error content");
        }
    }
}

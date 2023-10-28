import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }
        catch (Exception e){
            System.out.println("File does not exist");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max value is: " + max);
            bufferedWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Codegym\\module-02-Advanced-programming- with-Java-2.1\\lession-17-IO-Binary-File-Serialization\\copy-binary-file\\src/hello.txt");
        File destFile = new File("C:\\Codegym\\module-02-Advanced-programming- with-Java-2.1\\lession-17-IO-Binary-File-Serialization\\copy-binary-file\\src/hello1.txt");

        copyFileUsingStream(sourceFile, destFile);
//        readFileText(destFile);
    }

    private static void copyFileUsingStream(File source, File dest) {
        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(dest, true);
            if (!source.exists()) {
                throw new FileNotFoundException();
            }
            if (dest.exists()) {
                throw new FileAlreadyExistsException(dest.getName());
            }
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("Copy completed");
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileText(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
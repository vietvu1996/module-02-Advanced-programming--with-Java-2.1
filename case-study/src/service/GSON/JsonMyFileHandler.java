package service.GSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JsonMyFileHandler implements MyFileHandler {
    private final Gson GSON;

    public JsonMyFileHandler() {
        this.GSON = new GsonBuilder().setPrettyPrinting().create();
    }

    @Override
    public void saveToFile(String filePath, List<?> data) {
        try {
            Writer writer = new FileWriter(filePath);
            GSON.toJson(data, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Can't save file");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<?> readFromFile(String filePath, Type type) {
        try {
            Reader reader = new FileReader(filePath);
            return GSON.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file to read");
            System.out.println(e.getMessage());
            return null;
        }
    }
}

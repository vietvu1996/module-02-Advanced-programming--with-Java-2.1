package service;

import java.lang.reflect.Type;
import java.util.List;

public interface MyFileHandler {
    void saveToFile(String filePath, List<?> data);
    List<?> readFromFile(String filePath, Type type);
}

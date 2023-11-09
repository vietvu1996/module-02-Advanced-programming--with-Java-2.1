package service;

import java.lang.reflect.Type;

public interface FileHandler<T> {
    void saveToFile(String filePath, T data);
    T readFromFile(String filePath, Type type);
}

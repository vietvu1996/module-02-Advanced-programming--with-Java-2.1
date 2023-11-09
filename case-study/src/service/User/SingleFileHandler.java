package service.User;

import entity.User;

import java.lang.reflect.Type;

public interface SingleFileHandler<T extends User> {
    void saveToFile(String filePath, T data);
    T readFromFile(String filePath, Type type);
}

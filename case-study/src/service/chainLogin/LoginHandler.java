package service.chainLogin;

public interface LoginHandler {
    boolean doHandle(Request request);
    void handle(Request request);
}

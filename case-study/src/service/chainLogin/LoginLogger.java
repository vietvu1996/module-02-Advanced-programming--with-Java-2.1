package service.chainLogin;
import service.LoginHandler;
import service.Request;
import service.User.SingletonChairman;
import service.User.SingletonCurrentAssistantCoach;
import service.User.SingletonCurrentPlayer;

public class LoginLogger implements LoginHandler {
    private final LoginHandler nextHandler;

    public LoginLogger(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        try {
//            System.out.println("Set current user");
            SingletonCurrentPlayer.getInstance().setCurrentPlayer(request.getUsername(), request.getPassword());
            SingletonChairman.getInstance().setChairman(request.getUsername(), request.getPassword());
            SingletonCurrentAssistantCoach.getInstance().setAssistant(request.getUsername(), request.getPassword());
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public void handle(Request request) {
        if(!doHandle(request)) {
            return;
        }
        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

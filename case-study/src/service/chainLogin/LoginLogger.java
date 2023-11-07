package service.chainLogin;

import service.LoginHandler;
import service.Request;
import service.SingletonCurrentPlayer;

public class LoginLogger implements LoginHandler {
    private LoginHandler nextHandler;

    public LoginLogger(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        try {
            System.out.println("Set current user");
            SingletonCurrentPlayer.getInstance().setCurrentPlayer(request.getUsername(), request.getPassword());
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

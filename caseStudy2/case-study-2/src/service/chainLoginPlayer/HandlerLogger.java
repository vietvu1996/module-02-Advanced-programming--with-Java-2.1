package service.chainLoginPlayer;

import service.*;

public class HandlerLogger implements HandlerUserLogin {
    private HandlerUserLogin next;

    public HandlerLogger(HandlerUserLogin next) {
        this.next = next;
    }

    @Override
    public boolean doHandle(RequestUserInformation request) {
        try {
            SingletonCurrentPlayer.getInstance().setCurrentPlayer(request.getUsername(), request.getPassword());
            System.out.println("Log current user successfully");
            return true;
        } catch (NullPointerException e) {
            System.out.println("Can't log current user");
            return false;
        }
    }

    @Override
    public void handle(RequestUserInformation request) {
        if(!doHandle(request)) {
            return;
        }
        if(next != null) {
            next.handle(request);
        }
    }
}

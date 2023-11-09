package service.chainLogin;

import menu.MenuChairman.MenuChairman;
import menu.MenuPlayer.MenuPlayer;
import menu.Navigator;
import service.LoginHandler;
import service.Request;
import service.User.SingletonChairman;

public class LoginRedirect implements LoginHandler {
    private final LoginHandler nextHandler;

    public LoginRedirect(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        Navigator navigator = new MenuPlayer();
        Navigator navigator1 = new MenuChairman();
        if(SingletonChairman.getInstance().setChairman(request.getUsername(), request.getPassword())){
            navigator1.navigate();
        }
        else navigator.navigate();
        return true;
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

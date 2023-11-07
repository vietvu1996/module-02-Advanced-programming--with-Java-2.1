package service.chainLogin;

import menu.NavigationMenuProfile;
import menu.Navigator;
import service.LoginHandler;
import service.Request;

public class LoginRedirect implements LoginHandler {
    private LoginHandler nextHandler;

    public LoginRedirect(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        Navigator navigator = new NavigationMenuProfile();
        navigator.navigate();
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

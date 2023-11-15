package service.chainLoginPlayer;

import menu.MenuProfile;
import menu.Navigator;
import service.HandlerUserLogin;
import service.RequestUserInformation;

public class HandlerNavigate implements HandlerUserLogin {
    private HandlerUserLogin next;

    public HandlerNavigate(HandlerUserLogin next) {
        this.next = next;
    }

    @Override
    public boolean doHandle(RequestUserInformation request) {
        System.out.println("Logic navigate to new menu");
        Navigator navigator = new MenuProfile();
        navigator.navigate();
        return true;
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

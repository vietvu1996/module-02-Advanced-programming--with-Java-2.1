package service.chainLogin;

import menu.MenuAssistantCoach.MenuAssistantCoach;
import menu.MenuChairman.MenuChairman;
import menu.MenuCoach.MenuCoach;
import menu.MenuPlayer.MenuPlayer;
import menu.MenuSportDirector.MenuSportDirector;
import menu.MenuTechnicalDirector.MenuTechnicalDirector;
import menu.Navigator;
import service.LoginHandler;
import service.Request;
import service.User.*;

public class LoginRedirect implements LoginHandler {
    private final LoginHandler nextHandler;

    public LoginRedirect(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        Navigator navigator = new MenuPlayer();
        Navigator navigator1 = new MenuChairman();
        Navigator navigator2 = new MenuAssistantCoach();
        Navigator navigator3 = new MenuCoach();
        Navigator navigator4 = new MenuSportDirector();
        Navigator navigator5 = new MenuTechnicalDirector();
        if(SingletonChairman.getInstance().setChairman(request.getUsername(), request.getPassword())){
            navigator1.navigate();
        } else if (SingletonCurrentAssistantCoach.getInstance().setAssistant(request.getUsername(), request.getPassword())){
            navigator2.navigate();
        } else if (SingletonCurrentCoach.getInstance().setCoach(request.getUsername(), request.getPassword())) {
            navigator3.navigate();
        } else if (SingletonSportDirector.getInstance().setSportDirector(request.getUsername(), request.getPassword())) {
            navigator4.navigate();
        } else if (SingletonTechnicalDirector.getInstance().setTechnicalDirector(request.getUsername(), request.getPassword())) {
            navigator5.navigate();
        } else navigator.navigate();
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

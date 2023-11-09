package service.chainLogin;

import service.*;

public class LoginAuthenticator implements LoginHandler {
    private final LoginHandler nextHandler;

    public LoginAuthenticator(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        String username = request.getUsername();
        String password = request.getPassword();
        Validator validator1 = new ValidatePlayerCorrect(username, password);
        Validator validator2 = new ValidateChairmanCorrect(username, password);
        Validator validator3 = new ValidateAssistantCoachCorrect(username,password);
        return validator1.isCheck() || validator2.isCheck() || validator3.isCheck();

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

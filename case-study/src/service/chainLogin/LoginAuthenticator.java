package service.chainLogin;

import service.LoginHandler;
import service.Request;
import service.ValidatePlayerCorrect;
import service.Validator;

public class LoginAuthenticator implements LoginHandler {
    private LoginHandler nextHandler;

    public LoginAuthenticator(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean doHandle(Request request) {
        String username = request.getUsername();
        String password = request.getPassword();
        Validator validator = new ValidatePlayerCorrect(username, password);
        return validator.isCheck();
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

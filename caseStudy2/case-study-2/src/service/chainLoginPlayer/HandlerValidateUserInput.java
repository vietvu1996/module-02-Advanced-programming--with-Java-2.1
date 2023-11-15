package service.chainLoginPlayer;

import service.HandlerUserLogin;
import service.RequestUserInformation;
import service.Validator;
import service.ValidatorUserCorrect;

public class HandlerValidateUserInput implements HandlerUserLogin {
    private HandlerUserLogin next;

    public HandlerValidateUserInput(HandlerUserLogin next) {
        this.next = next;
    }

    @Override
    public boolean doHandle(RequestUserInformation request) {

        Validator validator = new ValidatorUserCorrect(request.getUsername(), request.getPassword());
        if(validator.isCheck()) {
            System.out.println("Check username and password successfully");
            return true;
        } else {
            System.out.println("Incorrect username or password");
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

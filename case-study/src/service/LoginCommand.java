package service;

import menu.Command;
import service.chainLogin.LoginAuthenticator;
import service.chainLogin.LoginLogger;
import service.chainLogin.LoginRedirect;
import service.chainLogin.LoginRequest;

import java.util.Scanner;

public class LoginCommand implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Login");
        System.out.println("Input username");
        String username = SCANNER.next();
        System.out.println("Input password");
        String password = SCANNER.next();

        //authenticator - logger - navigator ;
        //chain of responsibility;
        LoginHandler navigator = new LoginRedirect(null);
        LoginHandler logger = new LoginLogger(navigator);
        LoginHandler authenticator = new LoginAuthenticator(logger);
        authenticator.handle(new LoginRequest(username, password));
    }
}

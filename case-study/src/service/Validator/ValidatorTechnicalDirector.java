package service.Validator;

import entity.TechnicalDirector;
import service.User.SingletonTechnicalDirectorManagement;

public class ValidatorTechnicalDirector implements Validator{
    private final TechnicalDirector technicalDirector;
    private final String username;
    private final String password;

    public ValidatorTechnicalDirector(String username, String password){
        this.technicalDirector = SingletonTechnicalDirectorManagement.getInstance().getTechnicalDirector();
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean isCheck() {
        return technicalDirector.getUsername().equals(username) && technicalDirector.getPassword().equals(password);
    }
}

package test;

import constant.Constants;
import entity.SportDirector;
import entity.UserType;
import service.JsonSingleFileHandler;
import service.SingleFileHandler;

public class SportDirectorTest {
    public static void main(String[] args) {
        SingleFileHandler singleFileHandler = new JsonSingleFileHandler();
        SportDirector sportDirector = new SportDirector(UserType.SPORTDIRECTOR, "Deco", "000", "Anderson Luis de Souza", 46, "Male", "Football Player", 5, 150000 );
        singleFileHandler.saveToFile(Constants.SPORTDIRECTOR_FILE_PATH,sportDirector);
    }
}

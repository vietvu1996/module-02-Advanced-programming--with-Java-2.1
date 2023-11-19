package menu.MenuCoach;

import java.util.List;

public class CurrentTrainingSession {
    private TrainingSession currentTrainingSession;
    private static CurrentTrainingSession instance;
    private CurrentTrainingSession(){}

    public static CurrentTrainingSession getInstance(){
        if(instance == null){
            instance = new CurrentTrainingSession();
        }
        return instance;
    }

    public TrainingSession getCurrentTrainingSession() {
        return currentTrainingSession;
    }

    public void setCurrentTrainingSession(int id) {
        for(TrainingSession trainingSession: TrainingSessionSingleton.getInstance().getTrainingSessionList()){
            if(trainingSession.getId() == id){
                this.currentTrainingSession = trainingSession;
                return;
            }
        }
    }
}

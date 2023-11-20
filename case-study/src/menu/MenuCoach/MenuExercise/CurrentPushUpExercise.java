package menu.MenuCoach.MenuExercise;

public class CurrentPushUpExercise {
    private PushUpExercise currentPushUpExercise;
    private final PushUpSingleton pushUpSingleton = PushUpSingleton.getInstance();
    private static CurrentPushUpExercise instance;
    private CurrentPushUpExercise(){}

    public static CurrentPushUpExercise getInstance(){
        if(instance == null){
            instance = new CurrentPushUpExercise();
        }
        return instance;
    }

    public PushUpExercise getCurrentPushUpExercise() {
        return currentPushUpExercise;
    }


    public void setCurrentPushUpExercise(int id) {
        for(PushUpExercise pushUpExercise : pushUpSingleton.getPushUpExerciseList()){
            if(pushUpExercise.getId() == id){
                this.currentPushUpExercise = pushUpExercise;
                return;
            }
        }
    }
}

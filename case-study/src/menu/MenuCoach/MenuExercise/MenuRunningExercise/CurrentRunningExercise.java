package menu.MenuCoach.MenuExercise.MenuRunningExercise;

public class CurrentRunningExercise {
    private RunningExercise currentRunningExercise;
    private final RunningSingleton  runningSingleton = RunningSingleton.getInstance();
    private static CurrentRunningExercise instance;
    private CurrentRunningExercise(){}

    public static CurrentRunningExercise getInstance(){
        if(instance == null){
            instance = new CurrentRunningExercise();
        }
        return instance;
    }

    public RunningExercise getCurrentRunningExercise() {
        return currentRunningExercise;
    }

    public void setCurrentRunningExercise(int id) {
        for(RunningExercise runningExercise : runningSingleton.getRunningExerciseList()){
            if(runningExercise.getId() == id){
                this.currentRunningExercise = runningExercise;
                return;
            }
        }
    }
}

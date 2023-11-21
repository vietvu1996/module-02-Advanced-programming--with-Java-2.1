package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

public class CurrentDribblingExercise {
    private DribblingExercise dribblingExercise;
    private final DribblingSingleton dribblingSingleton = DribblingSingleton.getInstance();
    private static CurrentDribblingExercise instance;

    private CurrentDribblingExercise() {
    }

    public static CurrentDribblingExercise getInstance() {
        if (instance == null) {
            instance = new CurrentDribblingExercise();
        }
        return instance;
    }

    public DribblingExercise getDribblingExercise() {
        return dribblingExercise;
    }

    public void setCurrentDribblingExercise(int id){
        for (DribblingExercise dribblingExercise : dribblingSingleton.getDribblingExerciseList()) {
            if(dribblingExercise.getId() == id){
                this.dribblingExercise = dribblingExercise;
                return;
            }
        }
    }
}

package menu.MenuCoach;

public class DribblingExercise extends TrainingSession{
    private double successRate;

    public DribblingExercise(int id, String nameOfExercise, String levelOfDifficult, double successRate) {
        super(id, nameOfExercise, levelOfDifficult);
        this.successRate = successRate;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "DribblingExercise{" +
                "successRate=" + successRate +
                '}';
    }
}

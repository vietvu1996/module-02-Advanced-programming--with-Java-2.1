package menu.MenuCoach;

public class DribblingExercise{
    private double successRate;

    public DribblingExercise(int id, String nameOfExercise, String levelOfDifficult, double successRate) {
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

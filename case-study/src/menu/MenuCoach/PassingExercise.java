package menu.MenuCoach;

public class PassingExercise extends TrainingSession{
    private double accuracy;

    public PassingExercise(int id, String nameOfExercise, String levelOfDifficult, double accuracy) {
        super(id, nameOfExercise, levelOfDifficult);
        this.accuracy = accuracy;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "PassingExercise{" +
                "accuracy=" + accuracy +
                '}';
    }
}

package menu.MenuCoach;

public class PushUpExercise extends TrainingSession{
    private int times;

    public PushUpExercise(int id, String nameOfExercise, String levelOfDifficult, int times) {
        super(id, nameOfExercise, levelOfDifficult);
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "PushUpExercise{" +
                "times=" + times +
                '}';
    }
}

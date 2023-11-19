package menu.MenuCoach;

public class RunningExercise extends TrainingSession{
    private int laps;

    public RunningExercise(int id, String nameOfExercise, String levelOfDifficult, int laps) {
        super(id, nameOfExercise, levelOfDifficult);
        this.laps = laps;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    @Override
    public String toString() {
        return "RunningExercise{" +
                "laps=" + laps +
                '}';
    }
}

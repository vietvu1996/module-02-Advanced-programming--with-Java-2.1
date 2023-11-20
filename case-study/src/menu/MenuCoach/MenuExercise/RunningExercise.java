package menu.MenuCoach.MenuExercise;

public class RunningExercise{
    private int id;
    private String nameOfExercise;
    private String levelOfDifficult;
    private int laps;

    public RunningExercise(int id, String nameOfExercise, String levelOfDifficult, int laps) {
        this.id = id;
        this.nameOfExercise = nameOfExercise;
        this.levelOfDifficult = levelOfDifficult;
        this.laps = laps;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setNameOfExercise(String nameOfExercise) {
        this.nameOfExercise = nameOfExercise;
    }

    public String getLevelOfDifficult() {
        return levelOfDifficult;
    }

    public void setLevelOfDifficult(String levelOfDifficult) {
        this.levelOfDifficult = levelOfDifficult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RunningExercise{" +
                "id=" + id +
                ", nameOfExercise='" + nameOfExercise + '\'' +
                ", levelOfDifficult='" + levelOfDifficult + '\'' +
                ", laps=" + laps +
                '}';
    }
}

package menu.MenuCoach.MenuExercise.MenuPushUpExercise;

public class PushUpExercise{
    private int id;
    private String nameOfExercise;
    private String levelOfDifficult;
    private int times;

    public PushUpExercise(int id, String nameOfExercise, String levelOfDifficult, int times) {
        this.id = id;
        this.nameOfExercise = nameOfExercise;
        this.levelOfDifficult = levelOfDifficult;
        this.times = times;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "PushUpExercise{" +
                "id=" + id +
                ", nameOfExercise='" + nameOfExercise + '\'' +
                ", levelOfDifficult='" + levelOfDifficult + '\'' +
                ", times=" + times +
                '}';
    }
}

package menu.MenuCoach;

public class TrainingSession {
    private int id;
    private String nameOfExercise;
    private String levelOfDifficult;

    public TrainingSession(int id, String nameOfExercise, String levelOfDifficult) {
        this.id = id;
        this.nameOfExercise = nameOfExercise;
        this.levelOfDifficult = levelOfDifficult;
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
        return "TrainingSession{" +
                "id=" + id +
                ", nameOfExercise='" + nameOfExercise + '\'' +
                ", levelOfDifficult='" + levelOfDifficult + '\'' +
                '}';
    }
}

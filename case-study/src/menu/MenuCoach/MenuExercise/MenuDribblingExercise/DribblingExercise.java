package menu.MenuCoach.MenuExercise.MenuDribblingExercise;

public class DribblingExercise{
    private int id;
    private String nameOfExercise;
    private String levelOfDifficult;
    private double successRate;

    public DribblingExercise(int id, String nameOfExercise, String levelOfDifficult, double successRate) {
        this.id = id;
        this.nameOfExercise = nameOfExercise;
        this.levelOfDifficult = levelOfDifficult;
        this.successRate = successRate;
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

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "DribblingExercise{" +
                "id=" + id +
                ", nameOfExercise='" + nameOfExercise + '\'' +
                ", levelOfDifficult='" + levelOfDifficult + '\'' +
                ", successRate=" + successRate +
                '}';
    }
}

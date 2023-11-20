package menu.MenuCoach;

public class MovingExercise{
    private String frequency;

    public MovingExercise(int id, String nameOfExercise, String levelOfDifficult, String frequency) {
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "MovingExercise{" +
                "frequency='" + frequency + '\'' +
                '}';
    }
}

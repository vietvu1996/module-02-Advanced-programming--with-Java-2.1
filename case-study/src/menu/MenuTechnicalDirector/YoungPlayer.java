package menu.MenuTechnicalDirector;

public class YoungPlayer{
    private int id;
    private String name;
    private int age;
    private String position;
    private String performance;


//    public YoungPlayer(){}

    public YoungPlayer(int id, String name, int age, String position, String performance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.performance = performance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "YoungPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", performance='" + performance + '\'' +
                '}';
    }
}

package entity;

public class PlayerFactory {
    public User createUser(UserType userType, String username, String password, String fullName, String position, String dateOfBirth, String gender, String nationality, int height, int weight, boolean isLamasia, int tshirtNumber, int yearsContract, double salary) {
        switch (userType) {
            case PLAYER:
                return new Player(userType, username, password, fullName, position, dateOfBirth, gender, nationality, height, weight, isLamasia, tshirtNumber, yearsContract, salary);
            default:
                System.out.println("Invalid usertype");
                return null;
        }
    }
}

package menu.MenuTechnicalDirector;

public class CurrentYoungPlayer {
    private YoungPlayer currentYoungPlayer;

    private static CurrentYoungPlayer instance;
    private CurrentYoungPlayer() {}
    public static CurrentYoungPlayer getInstance() {
        if(instance == null) {
            instance = new CurrentYoungPlayer();
        }
        return instance;
    }

    public YoungPlayer getCurrentYoungPlayer() {
        return currentYoungPlayer;
    }

    public void setCurrentYoungPlayer(int id) {
        for(YoungPlayer youngPlayer : LaMasiaAcademySingleton.getInstance().getYoungPlayers()) {
            if(youngPlayer.getId() == id) {
                this.currentYoungPlayer = youngPlayer;
                return;
            }
        }
    }
}

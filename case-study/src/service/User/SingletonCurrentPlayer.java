package service.User;

import entity.Player;
import menu.MenuTechnicalDirector.LaMasiaAcademySingleton;
import menu.MenuTechnicalDirector.YoungPlayer;

import java.util.List;

public class SingletonCurrentPlayer {
     private final List<Player> players;
     private Player currentPlayer;
     private static SingletonCurrentPlayer instance;
     private SingletonCurrentPlayer(){
         players = SingletonPlayerListManagement.getInstance().getPlayers();
     }
     public static SingletonCurrentPlayer getInstance() {
         if(instance == null) {
             instance = new SingletonCurrentPlayer();
         }
         return instance;
     }
     public Player getCurrentPlayer(){
         return currentPlayer;
     }
     public void setCurrentPlayer(String username, String password) {
         for (Player user: players
              ) {
             if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                 currentPlayer = user;
                 return;
             }
         }
     }
     public String getCurrentPlayerName(){
         return currentPlayer.getFullName();
     }
     public void changeUsername(String newUsername){
         currentPlayer.setUsername(newUsername);
     }

    public void setCurrentPlayer(int id) {
        for(Player player : SingletonPlayerListManagement.getInstance().getPlayers()) {
            if(player.getId() == id) {
                this.currentPlayer = player;
                return;
            }
        }
    }
}

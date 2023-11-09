package service.User;

import entity.Player;
import entity.User;

import java.util.List;

public class SingletonCurrentPlayer {
     private List<Player> players;
     private Player currentPlayer;
     private static SingletonCurrentPlayer instance;
     private SingletonCurrentPlayer(){
         players = SingletonPlayerListManagement.getInstance().getPlayer();
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
         for (User user: players
              ) {
             if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                 currentPlayer = (Player) user;
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
}

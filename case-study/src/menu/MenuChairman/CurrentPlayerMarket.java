package menu.MenuChairman;

import entity.Player;
import menu.MenuTechnicalDirector.LaMasiaAcademySingleton;
import menu.MenuTechnicalDirector.YoungPlayer;

public class CurrentPlayerMarket {
    private Player currentPlayerMarket;
    private static CurrentPlayerMarket instance;
    private CurrentPlayerMarket(){}

    public static CurrentPlayerMarket getInstance(){
        if(instance == null){
            instance = new CurrentPlayerMarket();
        }
        return instance;
    }

    public Player getCurrentPlayerMarket() {
        return currentPlayerMarket;
    }

    public void setCurrentPlayerMarket(int id){
        for(Player transferMarket : TransferMarketSingleton.getInstance().getTransferMarketList()) {
            if(transferMarket.getId() == id) {
                this.currentPlayerMarket = transferMarket;
                return;
            }
        }
    }
}

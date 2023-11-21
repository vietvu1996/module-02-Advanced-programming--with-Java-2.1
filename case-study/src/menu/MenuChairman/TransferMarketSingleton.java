package menu.MenuChairman;

import com.google.gson.reflect.TypeToken;
import constant.Constants;
import entity.Player;
import menu.MenuTechnicalDirector.GenerateId;
import service.ChangeandUpdate.Observer;
import service.GSON.JsonMyFileHandler;
import service.GSON.MyFileHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TransferMarketSingleton implements Observer, GenerateId {
//    private List<TransferMarket> transferMarketList;

    private List<Player> transferMarketList;
    private static TransferMarketSingleton instance;
    private final MyFileHandler fileHandler;

    private TransferMarketSingleton() {
        fileHandler = new JsonMyFileHandler();
//        Type TRANSFER_MARKET_TYPE = new TypeToken<ArrayList<TransferMarket>>() {
//        }.getType();
        Type TRANSFER_MARKET_TYPE = new TypeToken<ArrayList<Player>>() {
        }.getType();
        this.transferMarketList = (List<Player>) fileHandler.readFromFile(Constants.TRANSFER_MARKET_PATH, TRANSFER_MARKET_TYPE);
        if (this.transferMarketList == null) {
            this.transferMarketList = new ArrayList<>();
        }
    }

    public static TransferMarketSingleton getInstance() {
        if (instance == null) {
            instance = new TransferMarketSingleton();
        }
        return instance;
    }

    public List<Player> getTransferMarketList() {
        return transferMarketList;
    }

    public void displayPlayer() {
        for (int i = 0; i < transferMarketList.size(); i++) {
            System.out.println((i+1) + ". " + transferMarketList.get(i).toString());
        }
    }


    public Player removePlayer(int choice) {
        return transferMarketList.remove(choice);
    }
    public void addPlayer(Player player) {
        transferMarketList.add(player);
    }

    @Override
    public void update() {
        fileHandler.saveToFile(Constants.TRANSFER_MARKET_PATH, transferMarketList);
        System.out.println("Transfer Market List was updated successfully");
    }

    @Override
    public int generateId() {
        try {
            int max = 0;
            for (Player playerMarket: transferMarketList) {
                if(max < playerMarket.getId()){
                    max = playerMarket.getId();
                }
            }
            return max + 1;
        }
        catch (NullPointerException e){
            return 1;
        }
    }
}

package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuMain implements Menu {
    List<MenuItem> menuItems;

    public MenuMain() {
        this.menuItems = new ArrayList<>();
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public void display() {
        for (int i = 1; i <= menuItems.size(); i++) {
            System.out.println(i + ". " + menuItems.get(i-1).getName());
        }
    }

    @Override
    public void runCommand(int index) {
        if (index >= 0 && index <= menuItems.size()) {
            menuItems.get(index).getCommand().execute();
        } else {
            System.out.println("Invalid choice, please try again");
        }
    }
}

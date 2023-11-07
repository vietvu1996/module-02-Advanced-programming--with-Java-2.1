package menu;

public interface Menu {
    void addMenuItem(MenuItem menuItem);
    void display();
    void runCommand(int index);
}

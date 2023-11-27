package service.ChangeandUpdate;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    public void removeAll() {
        observerList.clear();
    }
    public void notifyObserver(){
        for (Observer observer: observerList) {
            observer.update();
        }
    }
}

package service.ChangeandUpdate;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();
    void addObserver(Observer observer){
        observerList.add(observer);
    }
    void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    void notifyObserver(){
        for (Observer observer: observerList) {
            observer.update();
        }
    }
}

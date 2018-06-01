import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void rmvObserver(Observer obs){
        observers.remove(obs);
    }

    public void notifyObservers(){
        for (Observer o:
             observers) {
            o.update(this);
        }
    }
}

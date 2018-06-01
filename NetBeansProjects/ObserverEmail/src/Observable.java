import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> lst_observer = new ArrayList<>();

    public void addObserver(Observer ob){
        lst_observer.add(ob);
    }

    public void deleteObserver(Observer ob){
        lst_observer.remove(ob);
    }

    public void notifyObserver(){
        for (Observer o:
             lst_observer) {
            o.update(this);
        }
    }
}

package q2;

import java.util.ArrayList;
import java.util.List;

public class Source {
    private final List<Observer> list = new ArrayList<>();


    public void add(Observer obs){
        this.list.add(obs);
    }

    public void remove(Observer obs){
        this.list.remove(list.indexOf(obs));
    }

    public void notifyObs(){
        for(int i = 0 ; i < list.size() ; ++i){
            list.get(i).show(this);
        }
    }
}

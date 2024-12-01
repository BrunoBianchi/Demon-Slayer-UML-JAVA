package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    private String local;
    private List<Human> humans = new ArrayList<Human>();
    private List<Demon> demons = new ArrayList<Demon>();

    public List<Demon> getDemons() {
        return demons;
    }

    public void setDemons(Demon demon) {
        this.demons.add(demon);

    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(Human human) {
        this.getHumans().add(human);
    }
    
}

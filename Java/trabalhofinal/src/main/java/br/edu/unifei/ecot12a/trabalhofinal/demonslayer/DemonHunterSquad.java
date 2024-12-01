package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public class DemonHunterSquad {
private List<Human>hunters = new ArrayList<Human>();
private String local;

public List<Human> getHunters() {
    return hunters;
}

public void setHunters(Human hunter) {
    this.hunters.add(hunter);
}

public String getLocal() {
    return local;
}

public void setLocal(String local) {
    this.local = local;
}


}

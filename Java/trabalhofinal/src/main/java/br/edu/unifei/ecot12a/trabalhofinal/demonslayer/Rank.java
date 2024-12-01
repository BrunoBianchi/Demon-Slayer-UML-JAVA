package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public abstract class Rank {
    private int position;
    public abstract Demon<?> createNewDemon();

    public int getPosition() {
        return position;
    };

    public void setPosition(int position) {
       this.position = position;
    };

}

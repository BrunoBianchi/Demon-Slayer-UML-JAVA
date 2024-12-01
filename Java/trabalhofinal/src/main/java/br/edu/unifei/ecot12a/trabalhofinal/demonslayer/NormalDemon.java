package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class NormalDemon extends Rank {
    protected NormalDemon() {}

    @Override
    public Demon<?> createNewDemon() {
       return null;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public void setPosition(int position) {
      position = 0;
    }



    
}

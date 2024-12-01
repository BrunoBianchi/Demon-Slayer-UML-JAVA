package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class SuperiorMoon extends Rank{

    private FactoryHandler<NormalDemon> factory = new FactoryHandler<>(NormalDemon.class);


    protected SuperiorMoon() {
    };

    public Demon createNewDemon() {
        return factory.createNewDemon(NormalDemon.class);
    }



}

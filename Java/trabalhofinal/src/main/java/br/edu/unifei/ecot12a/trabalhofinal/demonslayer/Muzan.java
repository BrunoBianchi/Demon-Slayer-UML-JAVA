package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class Muzan {
    private String Form;
    private static Muzan instance = new Muzan();
    private Rank r = new SuperiorMoon();

    private Muzan() {
    };

    public static Muzan getInstance() {
        return instance;

    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public Rank getRank() {
        return r;
    }

    public <R extends Rank> Demon<R> createDemon(Class<R> rankClass) {
        FactoryHandler<R> factoryHandler = new FactoryHandler<>(rankClass);
        return factoryHandler.createNewDemon(rankClass);
    }

}

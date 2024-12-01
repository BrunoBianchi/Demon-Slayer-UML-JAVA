package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class DemonFactory<R extends Rank> {
    private static DemonFactory instance = new DemonFactory();

    private DemonFactory() {
    };

    public static DemonFactory getInstance() {
        return instance;
    }

    public Demon createDemon(Class<R> rankClass) {
        return new Demon(rankClass);
    }
}

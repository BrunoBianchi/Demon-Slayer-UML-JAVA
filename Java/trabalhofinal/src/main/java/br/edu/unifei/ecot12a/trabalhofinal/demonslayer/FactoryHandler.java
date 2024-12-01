package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class FactoryHandler<R extends Rank> {
    private RankFactory<R> rankFactory;
    private DemonFactory demonFactory = DemonFactory.getInstance();

    private RankFactory<R> createFactory(Class<R> rankType) {
        if (rankType.equals(SuperiorMoon.class)) {
            return (RankFactory<R>) new SuperiorMoonFactory();
        } else if (rankType.equals(InferiorMoon.class)) {
            return (RankFactory<R>) new InferiorMoonFactory();
        } else if (rankType.equals(NormalDemon.class)) {
            return (RankFactory<R>) new NormalFactory();
        }
        throw new IllegalArgumentException("Factory for rank type not found.");
    }

    public FactoryHandler(Class<R> rankType) {
        this.rankFactory = createFactory(rankType);
    }

    public Demon createNewDemon(Class<R> rankClass) {
        return demonFactory.createDemon(rankClass);

    }

}

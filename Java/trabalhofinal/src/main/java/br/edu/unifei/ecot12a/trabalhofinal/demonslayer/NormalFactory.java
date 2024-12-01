package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class NormalFactory implements RankFactory<NormalDemon> {
    public NormalDemon createRank() {
        return new NormalDemon();
    }
}

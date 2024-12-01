package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class Run extends Step {
    private String who;

    public Run(String who) {
        this.who = who;
    }

    public String getWho() {
        return who;
    }


    @Override
    public String toString() {
        return who;
    }
}
